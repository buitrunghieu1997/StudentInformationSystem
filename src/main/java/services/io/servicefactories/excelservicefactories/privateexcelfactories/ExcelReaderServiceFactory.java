/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.servicefactories.excelservicefactories.privateexcelfactories - IntelliJ IDEA
 * ExcelReaderServiceFactory.java
 * Created at 00:19 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.servicefactories.excelservicefactories.privateexcelfactories;

import services.io.servicefactories.excelservicefactories.AbstractExcelServiceFactory;
import services.io.serviceproducts.excelservices.ExcelService;
import services.io.serviceproducts.excelservices.ExcelServiceType;
import services.io.serviceproducts.excelservices.excelreaders.privateservices.*;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 00:19 ~ 06/12/2018
 */
public class ExcelReaderServiceFactory implements AbstractExcelServiceFactory {
	private static ExcelReaderServiceFactory instance;
	
	private ExcelReaderServiceFactory() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized ExcelReaderServiceFactory getInstance() {
		if (instance == null) {
			instance = new ExcelReaderServiceFactory();
		}
		return instance;
	}
	
	@Override public ExcelService getExcelServiceInstance(ExcelServiceType type) {
		switch (type) {
			case GENRE_EXCEL_READER:
				return GenreExcelReader.getInstance();
			case PROGRAM_EXCEL_READER:
				return ProgramExcelReader.getInstance();
			case ACCOUNT_EXCEL_READER:
				return AccountExcelReader.getInstance();
			case STUDENT_EXCEL_READER:
				return StudentExcelReader.getInstance();
			case SUBJECT_EXCEL_READER:
				return SubjectExcelReader.getInstance();
			case DEPARTMENT_EXCEL_READER:
				return DepartmentExcelReader.getInstance();
			case PERIMISSION_EXCEL_READER:
				return PermissionExcelReader.getInstance();
			case DETAIL_PERMISSION_EXCEL_READER:
				return DepartmentExcelReader.getInstance();
			case TOEIC_EXCEL_READER:
				return ToeicExcelReader.getInstance();
			case LEARNING_CHART_EXCEL_READER:
				return LearningChartExcelReader.getInstance();
			case MANAGER_EXCEL_READER:
				return ManagerExcelReader.getInstance();
			case SCHEDULE_EXCEL_READER:
				return ScheduleExcelReader.getInstance();
			case REGISTER_CLASS_EXCEL_READER:
				return RegisterClassExcelReader.getInstance();
			case SUBJECT_PARENT_EXCEL_READER:
				return SubjectParentExcelReader.getInstance();
			case SUBJECT_REGISTER_EXCEL_READER:
				return SubjectRegisterExcelReader.getInstance();
			case DETAIL_LEARNING_CHART_EXCEL_READER:
				return DetailLearningChartExcelReader.getInstance();
			case DETAIL_REGISTER_CLASS_EXCEL_READER:
				return DetailRegisterClassExcelReader.getInstance();
			case DETAIL_SUBJECT_REGISTER_EXCEL_READER:
				return DetailSubjectRegisterExcelReader.getInstance();
			default:
				throw new IllegalArgumentException("Invalid Type " + type.name());
		}
	}
}
