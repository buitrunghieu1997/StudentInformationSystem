/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.servicefactories.excelservicefactories - IntelliJ IDEA
 * ExcelServiceFactory.java
 * Created at 00:13 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.servicefactories.excelservicefactories;

import services.serviceproducts.excelservices.ExcelService;
import services.serviceproducts.excelservices.ExcelServiceType;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 00:13 ~ 06/12/2018
 */
public interface ExcelServiceFactory {
	public ExcelService getExcelServiceInstance(ExcelServiceType type);
}