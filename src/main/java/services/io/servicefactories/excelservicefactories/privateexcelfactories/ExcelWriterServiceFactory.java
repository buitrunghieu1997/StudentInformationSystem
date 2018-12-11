/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.servicefactories.excelservicefactories.privateexcelfactories - IntelliJ IDEA
 * ExcelWriterServiceFactory.java
 * Created at 00:19 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.servicefactories.excelservicefactories.privateexcelfactories;

import services.io.servicefactories.excelservicefactories.AbstractExcelServiceFactory;
import services.io.serviceproducts.excelservices.ExcelService;
import services.io.serviceproducts.excelservices.ExcelServiceType;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 00:19 ~ 06/12/2018
 */
public class ExcelWriterServiceFactory implements AbstractExcelServiceFactory {
	private static ExcelWriterServiceFactory instance;
	
	private ExcelWriterServiceFactory() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized ExcelWriterServiceFactory getInstance() {
		if (instance == null) {
			instance = new ExcelWriterServiceFactory();
		}
		return instance;
	}
	
	@Override public ExcelService getExcelServiceInstance(ExcelServiceType type) {
		switch (type) {
			case GENRE_EXCEL_WRITER:
			case PROGRAM_EXCEL_WRITER:
			case ACCOUNT_EXCEL_WRITER:
			case STUDENT_EXCEL_WRITER:
			case SUBJECT_EXCEL_WRITER:
			case DEPARTMENT_EXCEL_WRITER:
			case PERIMISSION_EXCEL_WRITER:
			case DETAIL_PERMISSION_EXCEL_WRITER:
			case TOEIC_EXCEL_WRITER:
			case LEARNING_CHART_EXCEL_WRITER:
			case MANAGER_EXCEL_WRITER:
			case SCHEDULE_EXCEL_WRITER:
			case REGISTER_CLASS_EXCEL_WRITER:
			case SUBJECT_PARENT_EXCEL_WRITER:
			case SUBJECT_REGISTER_EXCEL_WRITER:
			case DETAIL_LEARNING_CHART_EXCEL_WRITER:
			case DETAIL_REGISTER_CLASS_EXCEL_WRITER:
			case DETAIL_SUBJECT_REGISTER_EXCEL_WRITER:
			default:
				throw new IllegalArgumentException("Invalid Type " + type.name());
		}
	}
}
