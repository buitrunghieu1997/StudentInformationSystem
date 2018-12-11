/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, services - IntelliJ IDEA
 * BaseExcelReaderService.java, 22/10/2018 Trung Hieu Bui (Mr)
 */
package services.io.serviceproducts.excelservices.excelreaders;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import services.io.serviceproducts.excelservices.BaseExcelService;
import utils.Constants;

import java.io.File;
import java.io.IOException;

/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */
public class BaseExcelReaderService extends BaseExcelService {
	private Workbook workbook;
	
	protected BaseExcelReaderService() {
		try {
			// default
			workbook = WorkbookFactory.create(new File(Constants.EXCEL_WORKBOOK_LOCATION));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Workbook getWorkbook() {
		return workbook;
	}
	
	public void setWorkbook(Workbook workbook) {
		this.workbook = workbook;
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
				try {
					String tmp = "" + cell.getNumericCellValue();
					return Integer.parseInt(tmp.substring(0, tmp.length() - 2));
				} catch (NumberFormatException e) {
					try {
						return Double.parseDouble("" + cell.getNumericCellValue());
					} catch (NumberFormatException e2) {
						throw new NumberFormatException("The data is not a number");
					}
				}
			case STRING:
				return cell.getStringCellValue();
			case _NONE:
			case BOOLEAN:
			case FORMULA:
			case ERROR:
			case BLANK:
			default:
				throw new IllegalStateException("Dữ liệu trong cột không hợp lệ");
		}
	}
	
	public double solveDoubleValue(Cell cell) {
		double returnVal;
		try {
			returnVal = (double) setCellValue(cell);
		} catch (Exception e) {
			returnVal = Constants.ZERO_DOUBLE + (int) setCellValue(cell);
		}
		return returnVal;
	}
}
