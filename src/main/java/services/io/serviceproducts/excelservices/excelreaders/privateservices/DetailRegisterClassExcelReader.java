/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * DetailRegisterClassExcelReader.java
 * Created at 09:45 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDetailregisterclass;
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
 * @author Bùi Trung Hiếu  Created: 09:45 ~ 06/12/2018
 */
public class DetailRegisterClassExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static DetailRegisterClassExcelReader instance;
	
	private DetailRegisterClassExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DetailRegisterClassExcelReader getInstance() {
		if (instance == null) {
			instance = new DetailRegisterClassExcelReader();
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
				int    id            = (int) setCellValue(row.getCell(0));
				int    idSchedule    = (int) setCellValue(row.getCell(1));
				String classCode     = (String) setCellValue(row.getCell(2));
				int    tuition       = (int) setCellValue(row.getCell(3));
				double midSemPoint   = solveDoubleValue(row.getCell(4));
				double finalSemPoint = solveDoubleValue(row.getCell(5));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblDetailregisterclass detailregisterclass = new TblDetailregisterclass();
				
				detailregisterclass.setIdRegister(id);
				detailregisterclass.setIdSchedule(idSchedule);
				detailregisterclass.setClassCode(classCode);
				detailregisterclass.setTuition(tuition);
				detailregisterclass.setMidSemPoint(midSemPoint);
				detailregisterclass.setFinalSemPoint(finalSemPoint);
				detailregisterclass.setStt(Constants.CREATED);
				detailregisterclass.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(detailregisterclass);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDetailRegisterClass();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.DETAIL_REGISTER_CLASS_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.DETAIL_REGISTER_CLASS));
	}
}
