/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * PermissionReaderExcelReader.java
 * Created at 22:53 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblPermission;
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
 * @author Bùi Trung Hiếu  Created: 22:53 ~ 05/12/2018
 */
public class PermissionReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static PermissionReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized PermissionReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new PermissionReaderExcelReader();
		}
		return instance;
	}
	
	private PermissionReaderExcelReader() {
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
}
