/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * DetailSubjectRegisterExcelReader.java
 * Created at 09:48 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDetailsubjectregister;
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
 * @author Bùi Trung Hiếu  Created: 09:48 ~ 06/12/2018
 */
public class DetailSubjectRegisterExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static DetailSubjectRegisterExcelReader instance;
	
	private DetailSubjectRegisterExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DetailSubjectRegisterExcelReader getInstance() {
		if (instance == null) {
			instance = new DetailSubjectRegisterExcelReader();
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
				String idSubject = (String) setCellValue(row.getCell(1));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblDetailsubjectregister detailsubjectregister = new TblDetailsubjectregister();
				
				detailsubjectregister.setIdRegister(id);
				detailsubjectregister.setIdSubject(idSubject);
				detailsubjectregister.setStt(Constants.CREATED);
				detailsubjectregister.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(detailsubjectregister);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDetailSubjectRegister();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.DETAIL_SUBJECT_REGISTER_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.DETAIL_SUBJECT_REGISTER));
	}
}
