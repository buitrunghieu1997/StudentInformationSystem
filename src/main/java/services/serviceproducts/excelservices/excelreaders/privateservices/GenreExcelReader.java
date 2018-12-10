/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * GenreReaderExcelReader.java
 * Created at 22:56 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblGenre;
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
 * @author Bùi Trung Hiếu  Created: 22:56 ~ 05/12/2018
 */
public class GenreReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static GenreReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized GenreReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new GenreReaderExcelReader();
		}
		return instance;
	}
	
	private GenreReaderExcelReader() {
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
}
