/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * PermissionExcelReader.java
 * Created at 22:53 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblPermission;
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
 * @author Bùi Trung Hiếu  Created: 22:53 ~ 05/12/2018
 */
public class PermissionExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static PermissionExcelReader instance;
	
	private PermissionExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized PermissionExcelReader getInstance() {
		if (instance == null) {
			instance = new PermissionExcelReader();
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
				int    id      = (int) setCellValue(row.getCell(0));
				String name    = (String) setCellValue(row.getCell(1));
				String content = (String) setCellValue(row.getCell(2));
				
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblPermission permission = new TblPermission();
				
				permission.setIdPermission(id);
				permission.setName(name);
				permission.setContent(content);
				permission.setStt(Constants.CREATED);
				permission.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(permission);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readPermission();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.PERIMISSION_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.PERIMISSION));
	}
}
