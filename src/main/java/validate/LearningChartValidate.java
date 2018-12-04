/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import dao.impl.StudentDaoImpl;


/**
 * @author vuduchiep
 */
public class LearningChartValidate {
	
	public boolean validate(int idLearningChart, Integer idStudent, Integer totalCredit) {
		
		if (!idStudent.equals("") || !totalCredit.equals("")) {
			return new StudentDaoImpl().checkStudent(idStudent);
		}
		return false;
	}
}
