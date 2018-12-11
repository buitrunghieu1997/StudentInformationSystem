/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import dao.impl.InformationStudentDAOImpl;
import entities.TblStudent;
import logics.InfomationStudentLogic;
import validate.InfomationStudentValidate;

import java.util.List;

/**
 * @author vuduchiep
 */
public class InformationStudentLogicImpl implements InfomationStudentLogic {
	
	private InformationStudentDAOImpl informationStudentDAO = new InformationStudentDAOImpl();
	
	@Override
	public List<TblStudent> displayInfomationStudent(int idStudent) {
		
		
		return informationStudentDAO.list(idStudent);
	}
	
	@Override
	public boolean updateInfomationStudent(int idStudent, String fullName, String address, String phone, String dateOfBith, String email) {
		
		if (new InfomationStudentValidate().infoStudentValidate(fullName, address, phone, dateOfBith, email)) {
			return informationStudentDAO.update(idStudent, fullName, address, phone, dateOfBith, email);
		}
		return false;
	}
	
}
