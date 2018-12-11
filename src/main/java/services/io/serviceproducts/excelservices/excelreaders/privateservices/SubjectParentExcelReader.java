/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * SubjectParentExcelReader.java
 * Created at 09:31 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblSubjectparent;
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
 * @author Bùi Trung Hiếu  Created: 09:31 ~ 06/12/2018
 */
public class SubjectParentExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static SubjectParentExcelReader instance;
	
	private SubjectParentExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized SubjectParentExcelReader getInstance() {
		if (instance == null) {
			instance = new SubjectParentExcelReader();
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
				String idSubject       = (String) setCellValue(row.getCell(0));
				String idSubjectParent = (String) setCellValue(row.getCell(0));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblSubjectparent subjectparent = new TblSubjectparent();
				
				subjectparent.setIdSubject(idSubject);
				subjectparent.setIdSubjectParent(idSubjectParent);
				subjectparent.setStt(Constants.CREATED);
				subjectparent.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(subjectparent);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readSubjectParent();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.SUBJECT_PARENT_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.SUBJECT_PARENT));
	}
}
