/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * SubjectRegisterExcelReader.java
 * Created at 09:41 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblSubjectregister;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import services.io.serviceproducts.excelservices.ExcelServiceType;
import services.io.serviceproducts.excelservices.excelreaders.BaseExcelReaderService;
import services.io.serviceproducts.excelservices.excelreaders.ExcelReaderService;
import utils.Constants;
import utils.HibernateUtils;

import java.util.Calendar;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 09:41 ~ 06/12/2018
 */
public class SubjectRegisterExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static SubjectRegisterExcelReader instance;
	
	private SubjectRegisterExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized SubjectRegisterExcelReader getInstance() {
		if (instance == null) {
			instance = new SubjectRegisterExcelReader();
		}
		return instance;
	}
	
	@Override public void read(Sheet sheet) {
		Row row;
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int    id        = (int) setCellValue(row.getCell(0));
				int    idStudent = (int) setCellValue(row.getCell(1));
				String semester  = String.valueOf(setCellValue(row.getCell(2)));
				int    credit    = (int) setCellValue(row.getCell(3));
				int    maxCredit = (int) setCellValue(row.getCell(4));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblSubjectregister subjectregister = new TblSubjectregister();
				
				subjectregister.setIdRegister(id);
				subjectregister.setIdStudent(idStudent);
				subjectregister.setSemester(semester);
				subjectregister.setCredit(credit);
				subjectregister.setMaxCredit(maxCredit);
				subjectregister.setStt(Constants.CREATED);
				subjectregister.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(subjectregister);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readSchedule();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.SUBJECT_REGISTER_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.SUBJECT_REGISTER));
	}
}
