/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * ToeicExcelReader.java
 * Created at 09:38 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblToeic;
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
 * @author Bùi Trung Hiếu  Created: 09:38 ~ 06/12/2018
 */
public class ToeicExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static ToeicExcelReader instance;
	
	private ToeicExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized ToeicExcelReader getInstance() {
		if (instance == null) {
			instance = new ToeicExcelReader();
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
				int    idStudent = (int) setCellValue(row.getCell(0));
				String semester  = String.valueOf(setCellValue(row.getCell(1)));
				String date = sdf.format(DateUtil.getJavaDate(
						Constants.ZERO_DOUBLE + (int) setCellValue(row.getCell(2))));
				int point = (int) setCellValue(row.getCell(3));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblToeic toeic = new TblToeic();
				
				toeic.setIdstudent(idStudent);
				toeic.setSemester(semester);
				toeic.setDate(date);
				toeic.setPoint(point);
				toeic.setStt(Constants.CREATED);
				toeic.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(toeic);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readToeic();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.TOEIC_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.TOEIC));
	}
}
