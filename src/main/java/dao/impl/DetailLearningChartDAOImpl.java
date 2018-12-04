/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DetailLearningChartDAO;
import entities.TblDetaillearningchart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

/**
 * @author vuduchiep
 */
public class DetailLearningChartDAOImpl implements DetailLearningChartDAO {
	
	@Override
	public boolean delete(int idLearningChart) {
		Session                session             = HibernateUtils.getSessionFactory().getCurrentSession();
		TblDetaillearningchart detailLearningChart = new TblDetaillearningchart();
		
		try {
			
			session.getTransaction().begin();
			detailLearningChart = session.get(TblDetaillearningchart.class, idLearningChart);
			session.delete(detailLearningChart);
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public List<TblDetaillearningchart> search(int idLearningChart) {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String hql   = "from  TblDetaillearningchart  where idLearningChart = :idLearningChart";
			Query  query = session.createQuery(hql);
			query.setParameter("idLearningChart", idLearningChart);
			List<TblDetaillearningchart> list = query.list();
			return list;
		} catch (Exception ex) {
			System.out.println("Loi: " + ex.getMessage());
			return null;
		}
	}
	
	@Override
	public boolean add(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt) {
		
		Session                session             = HibernateUtils.getSessionFactory().getCurrentSession();
		TblDetaillearningchart detailLearningChart = new TblDetaillearningchart();
		
		try {
			
			session.getTransaction().begin();
			detailLearningChart.setIdLearningChart(idLearningChart);
			detailLearningChart.setIdSubject(idSubject);
			detailLearningChart.setCredit(credit);
			detailLearningChart.setSemester(semester);
			detailLearningChart.setStt(stt);
			
			
			session.save(detailLearningChart);
			
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean update(int idLearningChart, String idSubject, String semester, Integer credit, Integer stt) {
		
		Session                session             = HibernateUtils.getSessionFactory().getCurrentSession();
		TblDetaillearningchart detailLearningChart = new TblDetaillearningchart();
		
		try {
			session.getTransaction().begin();
			detailLearningChart = session.get(TblDetaillearningchart.class, idLearningChart);
			detailLearningChart.setIdSubject(idSubject);
			detailLearningChart.setCredit(credit);
			detailLearningChart.setSemester(semester);
			detailLearningChart.setStt(stt);
			
			session.update(detailLearningChart);
			session.getTransaction().commit();
			
			return true;
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	
}
