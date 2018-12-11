/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.io.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * GenreExcelReader.java
 * Created at 22:56 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.io.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblGenre;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import services.io.serviceproducts.excelservices.ExcelServiceType;
import services.io.serviceproducts.excelservices.excelreaders.BaseExcelReaderService;
import services.io.serviceproducts.excelservices.excelreaders.ExcelReaderService;
import utils.Constants;
import utils.HibernateUtils;

import java.util.Calendar;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author Bùi Trung Hiếu  Created: 22:56 ~ 05/12/2018
 */
public class GenreExcelReader extends BaseExcelReaderService implements ExcelReaderService {
	private static GenreExcelReader instance;
	
	private GenreExcelReader() {
	}
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized GenreExcelReader getInstance() {
		if (instance == null) {
			instance = new GenreExcelReader();
		}
		return instance;
	}
	
	@Override public void read(Sheet sheet) {
		Row row;
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int    id           = (int) setCellValue(row.getCell(0));
				int    idDepartment = (int) setCellValue(row.getCell(1));
				String name         = (String) setCellValue(row.getCell(2));
				
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblGenre genre = new TblGenre();
				
				genre.setIdGenre(id);
				genre.setIdDepartment(idDepartment);
				genre.setName(name);
				genre.setStt(Constants.CREATED);
				genre.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(genre);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readGenre();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.GENRE_EXCEL_READER;
	}
	
	@Override public void magic() {
		read(getWorkbook().getSheet(Constants.GENRE));
	}
}
