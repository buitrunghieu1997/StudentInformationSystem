package dao.impl;

import dao.DetailRegisterSubjectDao;

import entities.TblDetailsubjectregister;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.Commons;
import utils.Constants;
import utils.HibernateUtils;


/**
 *
 * @author Bui Minh Hieu
 */
public class DetailRegisterSubjectDaoImpl implements DetailRegisterSubjectDao {

    /**
     * Phuong thuc nay dung de them cac hoc phan ma hoc sinh dang ki trong 1 ki
     * @param idRegister ma dang ki
     * @param idSubject ma hoc phan
     * @return boolean neu them du lieu thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la fasle
     */
    @Override
    public boolean addDetailRegisterSubject(int idRegister, String idSubject) {
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblDetailsubjectregister detailsubjectregister=new TblDetailsubjectregister();
            detailsubjectregister.setIdRegister(idRegister);
            detailsubjectregister.setIdSubject(idSubject);
            detailsubjectregister.setStt(Constants.CREATED);
            detailsubjectregister.setTimeModified(Commons.getCurrentTime());
            session.save(detailsubjectregister);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung de xoa tat cac cac hoc phan ma sinh vien dang ki trong mot ki thong qua id register
     * @param idRegister ma dang ki
     * @return boolean neu xoa thanh cong ket qua tra ve la true nguoc lai la false
     */
    @Override
    public boolean deleteDetailRegisterSubject(int idRegister) {
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();
        Session session= sessionFactory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="delete TblDetailsubjectregister e where e.idRegister= "+idRegister;
            Query query= session.createQuery(hql);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: " + ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung de xoa cac dang ki hoc phan ma sinh vien dang ki trong 1 ki
     * @param idRegister ma dang ki
     * @param idSubject ma hoc phan
     * @return boolean neu xoa thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean ermanentlyDeleteDetailSubject(int idRegister, String idSubject) {
        SessionFactory sessionFactory= HibernateUtils.getSessionFactory();
        Session session= sessionFactory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="delete TblDetailsubjectregister e where  e.idRegister="+ idRegister+ " and e.idSubject="+ idSubject ;
            Query query= session.createQuery(hql);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }
}
