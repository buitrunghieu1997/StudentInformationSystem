/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import dao.impl.LearningChartDAOImpl;
import entities.TblLearningchart;
import logics.LearningChartLogic;
import validate.LearningChartValidate;

import java.util.List;

/**
 * @author vuduchiep
 */
public class LearningChartLogicImpl implements LearningChartLogic {
	
	LearningChartDAOImpl  learningChartDAOImpl  = new LearningChartDAOImpl();
	LearningChartValidate learningChartValidate = new LearningChartValidate();
	
	@Override
	public boolean add(int idLearningChart, Integer idStudent, Integer totalCredit) {
		
		if (learningChartValidate.validate(idLearningChart, idStudent, totalCredit)) {
			return learningChartDAOImpl.add(idLearningChart, idStudent, totalCredit);
		}
		return false;
	}
	
	@Override
	public boolean update(int idLearningChart, Integer idStudent, Integer totalCredit) {
		
		if (learningChartValidate.validate(idLearningChart, idStudent, totalCredit)) {
			return learningChartDAOImpl.update(idLearningChart, idStudent, totalCredit);
		}
		return false;
	}
	
	@Override
	public boolean delete(int idLearningChart) {
		
		return learningChartDAOImpl.delete(idLearningChart);
	}
	
	@Override
	public List<TblLearningchart> serach(int idLearningChart) {
		
		return learningChartDAOImpl.search(idLearningChart);
	}
	
}
