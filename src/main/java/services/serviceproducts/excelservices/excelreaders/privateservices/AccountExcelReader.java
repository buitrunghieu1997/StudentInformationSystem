/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * AccountReaderExcelReader.java
 * Created at 23:01 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblAccount;
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
 * @author Bùi Trung Hiếu  Created: 23:01 ~ 05/12/2018
 */
public class AccountReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static AccountReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized AccountReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new AccountReaderExcelReader();
		}
		return instance;
	}
	
	private AccountReaderExcelReader() {
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
				String username     = (String) setCellValue(row.getCell(2));
				String password     = (String) setCellValue(row.getCell(3));
				String salt         = (String) setCellValue(row.getCell(4));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblAccount account = new TblAccount();
				
				account.setIdAccount(id);
				account.setIdPermission(idPermission);
				account.setUsername(username);
				account.setPassword(password);
				account.setSalt(salt);
				account.setStt(Constants.CREATED);
				account.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(account);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readAccount();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.ACCOUNT_EXCEL_READER;
	}
}
