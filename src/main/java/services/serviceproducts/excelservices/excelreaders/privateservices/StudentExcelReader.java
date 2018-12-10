/*
 * Copyright(C) 2018 Bùi Trung Hiếu
 * StudentInformationSystem, services.serviceproducts.excelservices.excelreaders.privateservices - IntelliJ IDEA
 * StudentReaderExcelReader.java
 * Created at 23:28 ~ 05/12/2018 by Bùi Trung Hiếu
 */
package services.serviceproducts.excelservices.excelreaders.privateservices;

import entities.TblStudent;
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
 * @author Bùi Trung Hiếu  Created: 23:28 ~ 05/12/2018
 */
public class StudentReaderExcelReader extends BaseReaderExcelService implements ExcelReaderService {
	private static StudentReaderExcelReader instance;
	
	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static synchronized StudentReaderExcelReader getInstance() {
		if (instance == null) {
			instance = new StudentReaderExcelReader();
		}
		return instance;
	}
	
	private StudentReaderExcelReader() {
	}
	
	@Override public void read(Sheet sheet) {
		Row row;
		for (int i = 0;
		     i < sheet.getLastRowNum();
		     i++) {
			row = sheet.getRow(i + 1); // Skip the header
			try {
				int id = (int) setCellValue(row.getCell(0));
				int idProgram = (int) setCellValue(row.getCell(1));
				String fullName = (String) setCellValue(row.getCell(2));
				int gender = (int) setCellValue(row.getCell(3));
				String country = (String) setCellValue(row.getCell(4));
				String personality = (String) setCellValue(row.getCell(5));
				String religion = (String) setCellValue(row.getCell(6));
				String placeOfBirth = (String) setCellValue(row.getCell(7));
				int graduatedYear = (int) setCellValue(row.getCell(8));
				String highSchool = (String) setCellValue(row.getCell(9));
				int type = (int) setCellValue(row.getCell(10));
				String idNumber = (String) setCellValue(row.getCell(11));
				String issuedDate = (String) setCellValue(row.getCell(12));
				String issuedPlace = (String) setCellValue(row.getCell(13));
				String phone = (String) setCellValue(row.getCell(14));
				String email = (String) setCellValue(row.getCell(15));
				String currentAddr = (String) setCellValue(row.getCell(16));
				String permanentAddr = (String) setCellValue(row.getCell(17));
				String contactAddr = (String) setCellValue(row.getCell(18));
				String zone = (String) setCellValue(row.getCell(19));
				String dob = (String) setCellValue(row.getCell(20));
				String position = (String) setCellValue(row.getCell(21));
				int warningLv = (int) setCellValue(row.getCell(22));
				
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session        session = factory.getCurrentSession();
				session.getTransaction().begin();
				
				TblStudent student = new TblStudent();
				
				student.setIdStudent(id);
				student.setIdProgram(idProgram);
				student.setFullName(fullName);
				student.setGender(gender);
				student.setCountry(country);
				student.setPersonality(personality);
				student.setReligion(religion);
				student.setPlaceOfBirth(placeOfBirth);
				student.setHighSchoolGraduatedYear(graduatedYear);
				student.setHighSchool(highSchool);
				student.setType(type);
				student.setIdentityId(idNumber);
				student.setIssuedDate(issuedDate);
				student.setIssuedPlace(issuedPlace);
				student.setPhoneNumber(phone);
				student.setEmail(email);
				student.setCurrentAddress(currentAddr);
				student.setPermanentAddress(permanentAddr);
				student.setContactAddress(contactAddr);
				student.setZone(zone);
				student.setDateOfBirth(dob);
				student.setPosition(position);
				student.setWarningLevel(warningLv);
				student.setStt(Constants.CREATED);
				student.setTimeModified(Calendar.getInstance().getTime().toString());
				
				session.saveOrUpdate(student);
				session.getTransaction().commit();
			} catch (Exception e) {
				System.out.println("Lỗi ở hàm readDetailPermission();");
				e.printStackTrace();
			}
		}
	}
	
	@Override public ExcelServiceType getServiceType() {
		return ExcelServiceType.STUDENT_EXCEL_READER;
	}
}
