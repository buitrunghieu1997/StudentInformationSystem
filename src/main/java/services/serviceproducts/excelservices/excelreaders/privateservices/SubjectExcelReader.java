/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * SubjectReaderExcelReader.java
 * Created at 23:21 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblSubject;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import services.serviceproducts.excelservices.ExcelServiceType;
import services.serviceproducts.excelservices.excelreaders.BaseReaderExcelService;
import services.serviceproducts.excelservices.excelreaders.ExcelReaderService;
import utils.Constants;
import utils.HibernateUtils;

import java.util.Calendar;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 23:21 ~ 05/12/2018
 */
public class SubjectReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static SubjectReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized SubjectReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new SubjectReaderExcelReader();
		}
		return instance;
	}
	
	private SubjectReaderExcelReader() {
	}
	
	@Override public void read(Sheet sheet) {
		Row row;
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				String    id      = (String) setCellValue(row.getCell(0));
				int    idGenre      = (int) setCellValue(row.getCell(1));
				String name    = (String) setCellValue(row.getCell(2));
				int creditSubject = (int) setCellValue(row.getCell(3));
				int creditTuition = (int) setCellValue(row.getCell(4));
				int length = (int) setCellValue(row.getCell(5));
				double coefficient = (double) setCellValue(row.getCell(6));
				
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblSubject subject = new TblSubject();
				
				subject.setIdSubject(id);
				subject.setIdGenre(idGenre);
				subject.setName(name);
				subject.setCoefficient(coefficient);
				subject.setCreditSubject(creditSubject);
				subject.setCreditTuition(creditTuition);
				subject.setLenght(length);
				subject.setStt(Constants.CREATED);
				subject.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(subject);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDetailPermission();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.SUBJECT_EXCEL_READER;
	}
}
