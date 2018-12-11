/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import dao.impl.ProgramDAOImpl;
import entities.TblProgram;
import logics.ProgramLogic;
import validate.ProgramValidate;

import java.util.List;

/**
 * @author vuduchiep
 */
public class ProgramLogicImpl implements ProgramLogic {
	
	private ProgramValidate programValidate = new ProgramValidate();
	private ProgramDAOImpl  programDAO      = new ProgramDAOImpl();
	
	@Override
	public boolean insertProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description) {
		
		if (programValidate.validate(idProgram, idDepartment, length, credit, optionalCredit, description)) {
			return programDAO.insertProgram(idProgram, idDepartment, length, credit, optionalCredit, description);
		}
		return false;
	}
	
	@Override
	public boolean updateProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description) {
		
		if (programValidate.validate(idProgram, idDepartment, length, credit, optionalCredit, description)) {
			return programDAO.updateProgram(idProgram, idDepartment, length, credit, optionalCredit, description);
		}
		return false;
	}
	
	@Override
	public boolean deleteProgram(int idProgram) {
		
		return programDAO.deleteProgram(idProgram);
	}
	
	@Override
	public List<TblProgram> displayProgram(int idProgram) {
		
		return programDAO.displayProgram(idProgram);
	}
	
}
