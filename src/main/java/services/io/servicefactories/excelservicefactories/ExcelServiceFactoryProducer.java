/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.servicefactories - IntelliJ IDEA
 * ExcelServiceFactoryProducer.java
 * Created at 00:46 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.servicefactories.excelservicefactories;

import services.io.servicefactories.ServiceFactoryType;
import services.io.servicefactories.excelservicefactories.privateexcelfactories.ExcelReaderServiceFactory;
import services.io.servicefactories.excelservicefactories.privateexcelfactories.ExcelWriterServiceFactory;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 00:46 ~ 06/12/2018
 */
public class ExcelServiceFactoryProducer {
	private ExcelServiceFactoryProducer() {
		throw new AssertionError("You can't create instance of this class.");
	}
	
	public static AbstractExcelServiceFactory getExcelServiceFactory(ServiceFactoryType type) {
		switch (type) {
			case EXCEL_READER_FACTORY:
				return ExcelReaderServiceFactory.getInstance();
			case EXCEL_WRITER_FACTORY:
				return ExcelWriterServiceFactory.getInstance();
		}
		throw new IllegalArgumentException("Invalid type " + type.name());
	}
}
