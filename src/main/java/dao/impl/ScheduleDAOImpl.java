/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ScheduleDAO;
import entities.TblSchedule;
import entities.TblVSchedule;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

/**
 * @author vuduchiep
 */
public class ScheduleDAOImpl implements ScheduleDAO {
	
	@Override
	public boolean add(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt) {
		
		Session     session  = HibernateUtils.getSessionFactory().getCurrentSession();
		TblSchedule schedule = new TblSchedule();
		
		try {
			
			session.getTransaction().begin();
			
			schedule.setIdSchedule(idSchedule);
			schedule.setIdSubject(idSubject);
			schedule.setRoom(room);
			schedule.setTime(time);
			schedule.setStartWeek(startWeek);
			schedule.setSize(size);
			schedule.setMaxSize(maxSize);
			schedule.setStatus(status);
			schedule.setStt(stt);
			
			session.save(schedule);
			
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean update(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt) {
		
		Session     session  = HibernateUtils.getSessionFactory().getCurrentSession();
		TblSchedule schedule = new TblSchedule();
		
		try {
			session.getTransaction().begin();
			schedule = session.get(TblSchedule.class, idSchedule);
			schedule.setIdSubject(idSubject);
			schedule.setRoom(room);
			schedule.setTime(time);
			schedule.setStartWeek(startWeek);
			schedule.setSize(size);
			schedule.setMaxSize(maxSize);
			schedule.setStatus(status);
			schedule.setStt(stt);
			
			session.update(schedule);
			session.getTransaction().commit();
			
			return true;
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean delete(int idSchedule) {
		
		Session     session  = HibernateUtils.getSessionFactory().getCurrentSession();
		TblSchedule schedule = new TblSchedule();
		
		try {
			
			session.getTransaction().begin();
			schedule = session.get(TblSchedule.class, idSchedule);
			session.delete(schedule);
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public List<TblVSchedule> displaySchedule(int idStudent) {
		
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		
		try {
			session.getTransaction().begin();
			String hql   = "from TblVSchedule where idStudent = :idStudent";
			Query  query = session.createQuery(hql);
			query.setParameter("idStudent", idStudent);
			List list = query.list();
			
			return list;
			
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
			return null;
		}
	}
	
}
