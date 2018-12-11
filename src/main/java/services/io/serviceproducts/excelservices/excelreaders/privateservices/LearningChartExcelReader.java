/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * LearningChartExcelReader.java
 * Created at 09:39 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblLearningchart;
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
 * @author Bùi Trung Hiếu  Created: 09:39 ~ 06/12/2018
 */
public class LearningChartExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static LearningChartExcelReader instance;
	
	private LearningChartExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized LearningChartExcelReader getInstance() {
		if (instance == null) {
			instance = new LearningChartExcelReader();
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
				int id          = (int) setCellValue(row.getCell(0));
				int idStudent   = (int) setCellValue(row.getCell(1));
				int totalCredit = (int) setCellValue(row.getCell(2));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblLearningchart learningchart = new TblLearningchart();
				
				learningchart.setIdLearningChart(id);
				learningchart.setIdStudent(idStudent);
				learningchart.setTotalCredit(totalCredit);
				learningchart.setStt(Constants.CREATED);
				learningchart.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(learningchart);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readLearningChart();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.LEARNING_CHART_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.LEARNING_CHART));
	}
}
