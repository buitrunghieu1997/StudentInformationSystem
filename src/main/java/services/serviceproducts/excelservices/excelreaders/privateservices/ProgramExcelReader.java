/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * ProgramReaderExcelReader.java
 * Created at 22:59 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblProgram;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import services.serviceproducts.excelservices.ExcelServiceType;
import services.serviceproducts.excelservices.excelreaders.BaseReaderExcelService;
import services.serviceproducts.excelservices.excelreaders.ExcelReaderService;
import utils.Constants;
import utils.HibernateUtils;

import java.util.Calendar;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 22:59 ~ 05/12/2018
 */
public class ProgramReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static ProgramReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized ProgramReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new ProgramReaderExcelReader();
		}
		return instance;
	}
	
	private ProgramReaderExcelReader() {
	}
	
	@Override public void read(Sheet sheet) {
		Row row;
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int    id             = (int) setCellValue(row.getCell(0));
				int    idDepartment   = (int) setCellValue(row.getCell(1));
				int    length         = (int) setCellValue(row.getCell(2));
				int    credit         = (int) setCellValue(row.getCell(3));
				int    optionalCredit = (int) setCellValue(row.getCell(4));
				String description    = (String) setCellValue(row.getCell(5));
				
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblProgram program = new TblProgram();
				
				program.setIdProgram(id);
				program.setIdDepartment(idDepartment);
				program.setLength(length);
				program.setCredit(credit);
				program.setOptionalCredit(optionalCredit);
				program.setDescription(description);
				program.setStt(Constants.CREATED);
				program.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(program);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readProgram();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.PROGRAM_EXCEL_READER;
	}
}
