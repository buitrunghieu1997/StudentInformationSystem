/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * DetailLearningChartExcelReader.java
 * Created at 09:47 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblDetaillearningchart;
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
 * @author Bùi Trung Hiếu  Created: 09:47 ~ 06/12/2018
 */
public class DetailLearningChartExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static DetailLearningChartExcelReader instance;
	
	private DetailLearningChartExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized DetailLearningChartExcelReader getInstance() {
		if (instance == null) {
			instance = new DetailLearningChartExcelReader();
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
				String semester  = String.valueOf(setCellValue(row.getCell(2)));
				int    credit    = (int) setCellValue(row.getCell(3));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblDetaillearningchart detaillearningchart = new TblDetaillearningchart();
				
				detaillearningchart.setIdLearningChart(id);
				detaillearningchart.setIdSubject(idSubject);
				detaillearningchart.setSemester(semester);
				detaillearningchart.setCredit(credit);
				detaillearningchart.setStt(Constants.CREATED);
				detaillearningchart.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(detaillearningchart);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDetailLearningChart();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.DETAIL_LEARNING_CHART_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.DETAIL_LEARNING_CHART));
	}
}
