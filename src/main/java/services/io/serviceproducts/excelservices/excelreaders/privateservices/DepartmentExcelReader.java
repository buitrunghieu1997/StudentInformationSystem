/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts - IntelliJ IDEA
 * DepartmentExcelReader.java
 * Created at 22:19 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDepartment;
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
 * @author Bùi Trung Hiếu  Created: 22:19 ~ 05/12/2018
 */
public class DepartmentExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static DepartmentExcelReader instance;
	
	private DepartmentExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DepartmentExcelReader getInstance() {
		if (instance == null) {
			instance = new DepartmentExcelReader();
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
				int    id   = (int) setCellValue(row.getCell(0));
				String name = (String) setCellValue(row.getCell(1));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblDepartment department = new TblDepartment();
				
				department.setIdDepartment(id); // Auto generate
				department.setName(name);
				department.setStt(Constants.CREATED);
				department.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(department);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDepartment();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.DEPARTMENT_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.DEPARTMENT));
	}
}
