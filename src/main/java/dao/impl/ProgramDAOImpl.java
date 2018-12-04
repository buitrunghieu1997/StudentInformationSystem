/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ProgramDAO;
import entities.TblProgram;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

/**
 * @author vuduchiep
 */
public class ProgramDAOImpl implements ProgramDAO {
	
	@Override
	public boolean insertProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblProgram program = new TblProgram();
		
		try {
			
			session.getTransaction().begin();
			
			program.setIdProgram(idProgram);
			program.setIdDepartment(idDepartment);
			program.setLength(length);
			program.setCredit(credit);
			program.setOptionalCredit(optionalCredit);
			program.setDescription(description);
			
			session.save(program);
			
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
		
	}
	
	@Override
	public boolean updateProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblProgram program = new TblProgram();
		
		try {
			session.getTransaction().begin();
			program = session.get(TblProgram.class, idProgram);
			program.setIdDepartment(idDepartment);
			program.setLength(length);
			program.setCredit(credit);
			program.setOptionalCredit(optionalCredit);
			program.setDescription(description);
			
			session.update(program);
			session.getTransaction().commit();
			
			return true;
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
	@Override
	public boolean deleteProgram(int idProgram) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblProgram program = new TblProgram();
		
		try {
			
			session.getTransaction().begin();
			program = session.get(TblProgram.class, idProgram);
			session.delete(program);
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
		
	}
	
	@Override
	public List<TblProgram> displayProgram(int idProgram) {
		
		// how to code ???^^
		List<TblProgram> program = null;
		
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		
		try {
			session.getTransaction().begin();
			String hql   = "from TblProgram where idProgram = :idProgram";
			Query  query = session.createQuery(hql);
			query.setParameter("idProgram", idProgram);
			program = query.list();
			
			return program;
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
			return null;
		}
	}
	
}
