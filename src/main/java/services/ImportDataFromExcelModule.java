/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services - IntelliJ IDEA
 * ImportDataFromExcelModule.java
 * Created at 01:04 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services;

import services.io.servicefactories.ServiceFactoryType;
import services.io.servicefactories.excelservicefactories.AbstractExcelServiceFactory;
import services.io.servicefactories.excelservicefactories.ExcelServiceFactoryProducer;
import services.io.serviceproducts.excelservices.ExcelServiceType;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 01:04 ~ 06/12/2018
 */
public class ImportDataFromExcelModule {
	public static void main(String[] args) {
		AbstractExcelServiceFactory readerFactory = ExcelServiceFactoryProducer
				.getExcelServiceFactory(ServiceFactoryType.EXCEL_READER_FACTORY);
		
		readerFactory.getExcelServiceInstance(ExcelServiceType.DEPARTMENT_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.PERIMISSION_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.GENRE_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.PROGRAM_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.ACCOUNT_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.DETAIL_PERMISSION_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.SUBJECT_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.STUDENT_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.MANAGER_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.SCHEDULE_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.SUBJECT_PARENT_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.REGISTER_CLASS_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.TOEIC_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.LEARNING_CHART_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.SUBJECT_REGISTER_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.DETAIL_REGISTER_CLASS_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.DETAIL_LEARNING_CHART_EXCEL_READER).magic();
		readerFactory.getExcelServiceInstance(ExcelServiceType.DETAIL_SUBJECT_REGISTER_EXCEL_READER).magic();
		
		System.exit(0);
	}
}
