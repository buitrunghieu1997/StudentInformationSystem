/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * ScheduleExcelReader.java
 * Created at 09:31 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblSchedule;
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
 * @author Bùi Trung Hiếu  Created: 09:31 ~ 06/12/2018
 */
public class ScheduleExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static ScheduleExcelReader instance;
	
	private ScheduleExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized ScheduleExcelReader getInstance() {
		if (instance == null) {
			instance = new ScheduleExcelReader();
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
				int    id        = (int) setCellValue(row.getCell(0));
				String idSubject = (String) setCellValue(row.getCell(1));
				String room      = (String) setCellValue(row.getCell(2));
				String time      = (String) setCellValue(row.getCell(3));
				int    startWeek = (int) setCellValue(row.getCell(4));
				int    size      = (int) setCellValue(row.getCell(5));
				int    maxsize   = (int) setCellValue(row.getCell(6));
				int    status    = (int) setCellValue(row.getCell(7));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblSchedule schedule = new TblSchedule();
				
				schedule.setIdSchedule(id);
				schedule.setIdSubject(idSubject);
				schedule.setRoom(room);
				schedule.setTime(time);
				schedule.setStartWeek(startWeek);
				schedule.setSize(size);
				schedule.setMaxSize(maxsize);
				schedule.setStatus(status);
				schedule.setStt(Constants.CREATED);
				schedule.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(schedule);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readSchedule();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.SCHEDULE_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.SCHEDULE));
	}
}
