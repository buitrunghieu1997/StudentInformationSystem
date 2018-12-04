/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.sql.Date;

/**
 * @author vuduchiep
 */
public class InfomationStudentValidate {
	
	public boolean infoStudentValidate(String fullName, String address, String phone, Date dateOfBirth, String email) {
		
		return !fullName.equals("") && !address.equals("") && !phone.equals("") && !dateOfBirth.equals("") && !email.equals("");
	}
}
