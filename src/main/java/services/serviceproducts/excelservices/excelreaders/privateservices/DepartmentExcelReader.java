/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts - IntelliJ IDEA
 * DepartmentReaderExcelReader.java
 * Created at 22:19 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDepartment;
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
 * @author Bùi Trung Hiếu  Created: 22:19 ~ 05/12/2018
 */
public class DepartmentReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static DepartmentReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DepartmentReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new DepartmentReaderExcelReader();
		}
		return instance;
	}
	
	private DepartmentReaderExcelReader() {
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
}
