/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * ManagerExcelReader.java
 * Created at 08:33 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblManager;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import services.io.serviceproducts.excelservices.ExcelServiceType;
import services.io.serviceproducts.excelservices.excelreaders.BaseExcelReaderService;
import services.io.serviceproducts.excelservices.excelreaders.ExcelReaderService;
import utils.Constants;
import utils.HibernateUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 08:33 ~ 06/12/2018
 */
public class ManagerExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static ManagerExcelReader instance;
	
	private ManagerExcelReader() {
	
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized ManagerExcelReader getInstance() {
		if (instance == null) {
			instance = new ManagerExcelReader();
		}
		return instance;
	}
	
	@Override public void read(Sheet sheet) {
		Row              row;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int    id       = (int) setCellValue(row.getCell(0));
				String fullname = (String) setCellValue(row.getCell(1));
				String addr     = (String) setCellValue(row.getCell(2));
				String phone    = (String) setCellValue(row.getCell(3));
				String dob = sdf.format(DateUtil.getJavaDate(
						Constants.ZERO_DOUBLE + (int) setCellValue(row.getCell(4))));
				String email    = (String) setCellValue(row.getCell(5));
				String position = (String) setCellValue(row.getCell(6));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblManager manager = new TblManager();
				
				manager.setIdManager(id);
				manager.setFullname(fullname);
				manager.setAddress(addr);
				manager.setPhonenumber(phone);
				manager.setDateofbirth(dob);
				manager.setEmail(email);
				manager.setPosition(position);
				manager.setStt(Constants.CREATED);
				manager.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(manager);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readManager();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.MANAGER_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.MANAGER));
	}
}
