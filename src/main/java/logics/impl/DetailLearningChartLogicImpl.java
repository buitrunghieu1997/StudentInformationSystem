/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import dao.DetailLearningChartDAO;
import dao.impl.DetailLearningChartDAOImpl;
import entities.TblDetaillearningchart;
import logics.DetailLearningChartLogic;
import validate.DetailLearningChartValidate;

import java.util.List;

/**
 * @author vuduchiep
 */
public class DetailLearningChartLogicImpl implements DetailLearningChartLogic {
	
	private DetailLearningChartDAO      detailLearningChartDAO      = new DetailLearningChartDAOImpl();
	private DetailLearningChartValidate detailLearningChartValidate = new DetailLearningChartValidate();
	
	@Override
	public boolean delete(int idLearningChart) {
		
		return detailLearningChartDAO.delete(idLearningChart);
	}
	
	@Override
	public boolean add(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt) {
		
		if (detailLearningChartValidate.validate(idLearningChart, idSubject, semester, credit, stt)) {
			return detailLearningChartDAO.add(idLearningChart, idSubject, semester, credit, stt);
		}
		return false;
	}
	
	@Override
	public boolean update(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt) {
		
		if (detailLearningChartValidate.validate(idLearningChart, idSubject, semester, credit, stt)) {
			return detailLearningChartDAO.update(idLearningChart, idSubject, semester, credit, stt);
		}
		return false;
	}
	
	@Override
	public List<TblDetaillearningchart> search(int idLearningChart) {
		
		return detailLearningChartDAO.search(idLearningChart);
		
	}
	
}
