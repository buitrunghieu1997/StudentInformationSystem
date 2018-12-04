/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import dao.impl.DepartmentDAOImpl;

/**
 * @author vuduchiep
 */
public class ProgramValidate {
	
	public boolean validate(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description) {
		
		if (!length.equals("") || !credit.equals("") || !description.equals("")) {
			return new DepartmentDAOImpl().search(idDepartment) != null;
		}
		return false;
	}
}
