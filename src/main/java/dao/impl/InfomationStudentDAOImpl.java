/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.InfomationStudentDAO;
import entities.TblStudent;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.sql.Date;
import java.util.List;

/**
 * @author vuduchiep
 */
public class InfomationStudentDAOImpl implements InfomationStudentDAO {
	
	@Override
	public List<TblStudent> list(int idStudent) {
		
		List<TblStudent> list = null;
		
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		
		try {
			session.getTransaction().begin();
			String hql   = "from TblStudent where idStudent = :idStudent";
			Query  query = session.createQuery(hql);
			query.setParameter("idStudent", idStudent);
			list = query.list();
			return list;
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
			return null;
		}
		
	}
	
	@Override
	public boolean update(int idStudent, String fullName, String address, String phone, Date dateOfBith, String email) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblStudent student = new TblStudent();
		
		try {
			
			session.getTransaction().begin();
			student = session.get(TblStudent.class, idStudent);
			student.setFullName(fullName);
			student.setCurrentAddress(address);
			student.setPhoneNumber(phone);
			student.setDateOfBirth(dateOfBith);
			student.setEmail(email);
			
			session.update(student);
			session.getTransaction().commit();
			
			return true;
		} catch (Exception ex) {
			
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
	}
	
}
