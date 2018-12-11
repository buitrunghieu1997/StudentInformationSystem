/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services - IntelliJ IDEA
 * ExcelReaderService.java
 * Created at 21:48 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders;

import org.apache.poi.ss.usermodel.Sheet;
import services.io.serviceproducts.excelservices.ExcelService;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 21:48 ~ 05/12/2018
 */
public interface ExcelReaderService extends ExcelService {
	/**
	 * Read.
	 *
	 * @param sheet the sheet
	 */
	void read(Sheet sheet);
}
