/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * DetailPermissionReaderExcelReader.java
 * Created at 23:18 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDetailpermission;
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
 * @author Bùi Trung Hiếu  Created: 23:18 ~ 05/12/2018
 */
public class DetailPermissionReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static DetailPermissionReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DetailPermissionReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new DetailPermissionReaderExcelReader();
		}
		return instance;
	}
	
	private DetailPermissionReaderExcelReader() {
	}
	
	@Override public void read(Sheet sheet) {
		Row row;
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int    id      = (int) setCellValue(row.getCell(0));
				int    idPermission      = (int) setCellValue(row.getCell(1));
				String name    = (String) setCellValue(row.getCell(2));
				String status = (String) setCellValue(row.getCell(3));
				
				
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
}
