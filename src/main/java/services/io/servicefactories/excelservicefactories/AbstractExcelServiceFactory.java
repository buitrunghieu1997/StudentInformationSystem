/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.servicefactories.excelservicefactories - IntelliJ IDEA
 * AbstractExcelServiceFactory.java
 * Created at 00:13 ~ 06/12/2018 by Bùi Trung Hiếu
 */
package services.io.servicefactories.excelservicefactories;

import services.io.serviceproducts.excelservices.ExcelService;
import services.io.serviceproducts.excelservices.ExcelServiceType;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 00:13 ~ 06/12/2018
 */
public interface AbstractExcelServiceFactory {
	ExcelService getExcelServiceInstance(ExcelServiceType type);
}