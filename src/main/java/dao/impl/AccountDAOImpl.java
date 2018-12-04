package dao.impl;

import dao.AccountDAO;
import entities.TblAccount;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

public class AccountDAOImpl implements AccountDAO {
	
	@Override
	public boolean addAccount(int idAccount, String username, String password, Integer idPermission, Integer stt, String timeModified) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblAccount account = new TblAccount();
		
		try {
			
			session.getTransaction().begin();
			
			account.setIdAccount(idAccount);
			account.setUsername(username);
			account.setPassword(password);
			account.setIdPermission(idPermission);
			account.setStt(stt);
			account.setTimeModified(timeModified);
			
			session.save(account);
			
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
		
	}
	
	@Override
	public boolean deleteAccount(int idAccount) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblAccount account = new TblAccount();
		
		try {
			
			session.getTransaction().begin();
			account = session.get(TblAccount.class, idAccount);
			session.delete(account);
			session.getTransaction().commit();
			
			return true;
			
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
		
	}
	
	@Override
	public boolean changePassword(String username, String password) {
		
		Session    session = HibernateUtils.getSessionFactory().getCurrentSession();
		TblAccount account;
		
		try {
			
			session.getTransaction().begin();
			account = session.get(TblAccount.class, username);
			account.setPassword(password);
			
			session.update(account);
			session.getTransaction().commit();
			
			return true;
		} catch (Exception ex) {
			
			session.getTransaction().rollback();
			System.out.println("Loi: " + ex.getMessage());
			return false;
		}
		
	}
	
	@Override
	public List<TblAccount> getAccount(String username, String password) {
		
		List<TblAccount> account = null;
		
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		
		try {
			session.getTransaction().begin();
			String hql   = "from TblAccount where username = :username and password = :password";
			Query  query = session.createQuery(hql);
			query.setParameter("username", username);
			query.setParameter("password", password);
			account = query.list();
			return account;
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
			return null;
		}
		
	}
	
	@Override
	public String getSalt(String username) {
		
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		
		try {
			session.getTransaction().begin();
			String hql   = "Select salt from TblAccount where username = :username";
			Query  query = session.createQuery(hql);
			query.setParameter("username", username);
			String salt = (String) query.uniqueResult();
			return salt;
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
			return null;
		}
	}
	
}
