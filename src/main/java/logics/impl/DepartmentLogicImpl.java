/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import logics.DepartmentLogic;
import validate.DepartmentValidate;

/**
 * @author vuduchiep
 */
public class DepartmentLogicImpl implements DepartmentLogic {
	
	private DepartmentValidate departmentValidate = new DepartmentValidate();
	private DepartmentLogic    departmentLogic    = new DepartmentLogicImpl();
	
	@Override
	public boolean insertDepartment(int idDepartment, String name, String description) {
		
		if (departmentValidate.validate(idDepartment, name, description)) {
			return departmentLogic.insertDepartment(idDepartment, name, description);
		}
		return false;
	}
	
	@Override
	public boolean updateDepartment(int idDepartment, String name, String description) {
		
		if (departmentValidate.validate(idDepartment, name, description)) {
			return departmentLogic.updateDepartment(idDepartment, name, description);
		}
		return false;
	}
	
	@Override
	public boolean deleteDepartment(int idDepartment) {
		
		return departmentLogic.deleteDepartment(idDepartment);
	}
	
}
