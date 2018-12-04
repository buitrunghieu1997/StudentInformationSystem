/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import dao.impl.SubjectDaoImpl;

/**
 * @author vuduchiep
 */
public class DetailLearningChartValidate {
	
	public boolean validate(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt) {
		
		if (!semester.equals("") || !credit.equals("")) {
			return new SubjectDaoImpl().searchSubject(idSubject) != null;
		}
		return false;
	}
}
