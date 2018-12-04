/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.LearningChartDAO;
import entities.TblLearningchart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

/**
 * @author vuduchiep
 */
public class LearningChartDAOImpl implements LearningChartDAO {
	
	@Override
	public boolean add(int idLearningChart, Integer idStudent, Integer totalCredit) {
		
		
		Session          session       = HibernateUtils.getSessionFactory().getCurrentSession();
		TblLearningchart learningChart = new TblLearningchart();
		
		try {
			
			session.getTransaction().begin();
			learningChart.setIdLearningChart(idLearningChart);
			learningChart.setIdStudent(idStudent);
			learningChart.setTotalCredit(totalCredit);
			
			session.save(learningChart);
			
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean update(int idLearningChart, Integer idStudent, Integer totalCredit) {
		
		Session          session       = HibernateUtils.getSessionFactory().getCurrentSession();
		TblLearningchart learningChart = new TblLearningchart();
		
		try {
			session.getTransaction().begin();
			learningChart = session.get(TblLearningchart.class, idLearningChart);
			learningChart.setIdStudent(idStudent);
			learningChart.setTotalCredit(totalCredit);
			
			session.update(learningChart);
			session.getTransaction().commit();
			
			return true;
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean delete(int idLearningChart) {
		
		Session          session       = HibernateUtils.getSessionFactory().getCurrentSession();
		TblLearningchart learningChart = new TblLearningchart();
		
		try {
			
			session.getTransaction().begin();
			learningChart = session.get(TblLearningchart.class, idLearningChart);
			session.delete(learningChart);
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public List<TblLearningchart> search(int idLearningChart) {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String hql   = "from  TblLearningchart  where idLearningChart = :idLearningChart";
			Query  query = session.createQuery(hql);
			query.setParameter("idLearningChart", idLearningChart);
			List<TblLearningchart> list = query.list();
			return list;
		} catch (Exception ex) {
			System.out.println("Loi: " + ex.getMessage());
			return null;
		}
		
	}
	
}
