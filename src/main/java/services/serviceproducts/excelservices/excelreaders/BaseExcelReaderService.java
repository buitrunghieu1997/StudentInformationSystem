/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, services - IntelliJ IDEA
 * BaseReaderExcelService.java, 22/10/2018 Trung Hieu Bui (Mr)
 */
package services.serviceproducts.excelservices.excelreaders;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import services.serviceproducts.excelservices.BaseExcelService;
import utils.Constants;

import java.io.File;
import java.io.IOException;

/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */
public class BaseReaderExcelService extends BaseExcelService {
	private Workbook workbook;
	
	public Workbook getWorkbook() {
		return workbook;
	}
	
	public void setWorkbook(Workbook workbook) {
		this.workbook = workbook;
	}
	
	protected BaseReaderExcelService() {
		try {
			// default
			workbook = WorkbookFactory.create(new File(Constants.EXCEL_WORKBOOK_LOCATION));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Hàm trả về dữ liệu dựa theo kiểu của ô dữ liệu
	 *
	 * @param cell ô dữ liệu
	 * @return Giá trị của ô dữ liệu
	 */
	protected Object setCellValue(Cell cell) {
		CellType type = cell.getCellType();
		switch (type) {
			case NUMERIC:
				if (cell == null) {
					return 0;
				} else {
					if((Math.round(cell.getNumericCellValue()) - cell.getNumericCellValue()) == 0) {
						return (int) cell.getNumericCellValue();
					} else {
						return (double) cell.getNumericCellValue();
					}
				}
			case STRING:
				if (cell == null) {
					return "null";
				} else {
					return cell.getStringCellValue();
				}
			case _NONE:
			case BOOLEAN:
			case FORMULA:
			case ERROR:
			case BLANK:
			default:
				throw new IllegalStateException("Dữ liệu trong cột không hợp lệ");
		}
	}
}
