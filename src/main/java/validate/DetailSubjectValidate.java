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
public class DetailSubjectValidate {
	
	public boolean validate(int idDetailSubject, String idSubject, String idSubjectParent, Integer creditSubject, Integer creditTuition, Integer lenght, String subjectCode) {
		
		if (!idSubject.equals("") || !idSubjectParent.equals("") || !creditSubject.equals("") || !creditTuition.equals("") || !lenght.equals("") || !subjectCode.equals("")) {
			return new SubjectDaoImpl().searchSubject(idSubject) != null && new SubjectDaoImpl().searchSubject(idSubjectParent) != null;
		}
		return false;
	}
}
