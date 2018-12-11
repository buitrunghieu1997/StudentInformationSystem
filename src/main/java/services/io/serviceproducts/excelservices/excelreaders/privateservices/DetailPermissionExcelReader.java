/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * DetailPermissionExcelReader.java
 * Created at 23:18 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDetailpermission;
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
 * @author Bùi Trung Hiếu  Created: 23:18 ~ 05/12/2018
 */
public class DetailPermissionExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static DetailPermissionExcelReader instance;
	
	private DetailPermissionExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DetailPermissionExcelReader getInstance() {
		if (instance == null) {
			instance = new DetailPermissionExcelReader();
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
				int    id           = (int) setCellValue(row.getCell(0));
				int    idPermission = (int) setCellValue(row.getCell(1));
				String name         = (String) setCellValue(row.getCell(2));
				String status       = (String) setCellValue(row.getCell(3));
				
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblDetailpermission permission = new TblDetailpermission();
				
				permission.setIdDetailPermission(id);
				permission.setIdPermission(idPermission);
				permission.setName(name);
				permission.setStatus(status);
				permission.setStt(Constants.CREATED);
				permission.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(permission);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDetailPermission();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.DETAIL_PERMISSION_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.DETAIL_PERMISSION));
	}
}
