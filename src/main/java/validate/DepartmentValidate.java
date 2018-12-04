/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/**
 * @author vuduchiep
 */
public class DepartmentValidate {
	
	public boolean validate(int idDepartment, String name, String desciption) {
		return !name.equals("") && !desciption.equals("");
	}
}
