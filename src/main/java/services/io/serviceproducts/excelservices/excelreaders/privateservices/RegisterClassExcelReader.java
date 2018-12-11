/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * RegisterClassExcelReader.java
 * Created at 09:37 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblRegisterclass;
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
 * @author Bùi Trung Hiếu  Created: 09:37 ~ 06/12/2018
 */
public class RegisterClassExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static RegisterClassExcelReader instance;
	
	private RegisterClassExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized RegisterClassExcelReader getInstance() {
		if (instance == null) {
			instance = new RegisterClassExcelReader();
		}
		return instance;
	}
	
	@Override public void read(Sheet sheet) {
		Row              row;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int    id           = (int) setCellValue(row.getCell(0));
				int    idStudent    = (int) setCellValue(row.getCell(1));
				String semester     = String.valueOf(setCellValue(row.getCell(2)));
				int    totalCredit  = (int) setCellValue(row.getCell(3));
				int    tuitionPaid  = (int) setCellValue(row.getCell(4));
				int    totalTuition = (int) setCellValue(row.getCell(5));
				String deadline1 = sdf.format(DateUtil.getJavaDate(
						Constants.ZERO_DOUBLE + (int) setCellValue(row.getCell(6))));
				String deadline2 = sdf.format(DateUtil.getJavaDate(
						Constants.ZERO_DOUBLE + (int) setCellValue(row.getCell(7))));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblRegisterclass registerClass = new TblRegisterclass();
				
				registerClass.setIdRegister(id);
				registerClass.setIdStudent(idStudent);
				registerClass.setSemester(semester);
				registerClass.setTotalCredit(totalCredit);
				registerClass.setTuitionPaid(tuitionPaid);
				registerClass.setTotalTuition(totalTuition);
				registerClass.setTuitionDeadline1(deadline1);
				registerClass.setTuitionDeadline2(deadline2);
				registerClass.setStt(Constants.CREATED);
				registerClass.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(registerClass);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readRegisterClass();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.REGISTER_CLASS_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.REGISTER_CLASS));
	}
}
