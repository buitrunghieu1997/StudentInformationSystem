/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts - IntelliJ IDEA
 * ExcelWriterService.java
 * Created at 22:30 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelwriters;

import org.apache.poi.ss.usermodel.Sheet;
import services.io.serviceproducts.excelservices.ExcelService;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 22:30 ~ 05/12/2018
 */
public interface ExcelWriterService extends ExcelService {
	/**
	 * Write.
	 *
	 * @param sheet the sheet
	 */
	void write(Sheet sheet);
}