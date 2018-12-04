package dao.impl;

import dao.ToeicDao;
import entities.TblToeic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.Commons;
import utils.Constants;
import utils.HibernateUtils;

import java.sql.Date;

/**
 * @author Bui Minh Hieu
 */
public class ToeicDaoImpl implements ToeicDao {
	
	/**
	 * Phuong thuc nay dung de them diem toeic cua sinh vien trong co so du lieu
	 *
	 * @param idStudent Ma so sin vien
	 * @param semester  Diem toeic trong hoc ki ma sinh vien do thi
	 * @param date      Ngay thi
	 * @param point     diem sinh vien
	 * @return boolean neu them sinh vien vao db thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	@Override
	public boolean addToeic(int idStudent, String semester, Date date, int point) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			TblToeic toeic = new TblToeic();
			toeic.setIdstudent(idStudent);
			toeic.setSemester(semester);
			toeic.setDate(date);
			toeic.setPoint(point);
			toeic.setStt(Constants.CREATED);
			toeic.setTimeModified(Commons.getCurrentTime());
			session.save(toeic);
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay dung de update diem toeic cua sinh vien
	 *
	 * @param idStudent Ma so sinh vien
	 * @param semester  Hoc ki
	 * @param date      Ngay thi
	 * @param point     diem thi
	 * @return boolean neu update diem toeic thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean updateToeic(int idStudent, String semester, Date date, int point) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			TblToeic toeic = session.get(TblToeic.class, idStudent);
			toeic.setSemester(semester);
			toeic.setDate(date);
			toeic.setPoint(point);
			toeic.setStt(Constants.UPDATE);
			toeic.setTimeModified(Commons.getCurrentTime());
			session.save(toeic);
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			System.out.println("Loi:" + ex.getMessage());
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay dung de xoa diem toeic tam thoi
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean deleteToeic(int idStudent) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			TblToeic toeic = session.get(TblToeic.class, idStudent);
			toeic.setTimeModified(Commons.getCurrentTime());
			toeic.setStt(Constants.DELETED);
			session.save(toeic);
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			System.out.println("Loi: " + ex.getMessage());
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay de xoa vinh vien du lieu diem toeic cua sv khoi db
	 *
	 * @param idStudent Ma so sinh vien
	 * @return boolean neu xoa diem toeic thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve la false
	 */
	@Override
	public boolean ermanentlyDeleteToeic(int idStudent) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			TblToeic toeic = session.get(TblToeic.class, idStudent);
			session.delete(toeic);
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			System.out.println("Loi: " + ex.getMessage());
		}
		return false;
	}
	
	/**
	 * Phuong thuc nay tra ve diem sinh vien can tra cuu
	 *
	 * @param idStudent Ma so sinh vien
	 * @return Tbltoeic tra ve thong tinh cua sinh vien
	 */
	@Override
	public TblToeic searchToeic(int idStudent) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session        session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			TblToeic toeic = session.get(TblToeic.class, idStudent);
			session.getTransaction().commit();
			return toeic;
		} catch (Exception ex) {
			System.out.println("Loi: " + ex.getMessage());
		}
		return null;
	}
}
