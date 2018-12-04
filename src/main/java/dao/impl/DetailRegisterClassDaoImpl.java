package dao.impl;

import dao.DetailRegisterClassDao;
import entities.TblDetailregisterclass;
import entities.TblStudent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.Commons;
import utils.Constants;
import utils.HibernateUtils;

import java.util.List;

/**
 * @author Bui Minh Hieu
 */
public class DetailRegisterClassDaoImpl implements DetailRegisterClassDao {
    /**
     * Phuong thuc nay co chuc nang hien thi danh sach sinh vien trong mot lop
     * @param classCode ma lop
     * @return list tra ve danh sach sinh vien
     */
    @Override
    public List<TblStudent> showListStudent(String classCode) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="select TblStudent from TblDetailregisterclass, TblRegisterclass , TblStudent where TblDetailregisterclass .idRegister=TblRegisterclass .idRegister and TblRegisterclass.idStudent=TblStudent.idStudent and TblDetailregisterclass.classCode="+classCode;
            Query<TblStudent> query= session.createQuery(hql);
            List<TblStudent> ds=query.list();
            session.getTransaction().commit();
            return ds;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }

    /**
     * Phuong thuc nay co chuc nang kiem tra xem co ton tai ma lop khong
     * @param classCode ma lop
     * @return boolean tra ve true neu co ma lop nguoc lai tra ve false
     */
    @Override
    public boolean checkClassCode(String classCode) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="";
            Query query = session.createQuery(hql);
            List list =query.list();
            if(list.size()>0){
                return  true;
            }
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean addDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, int midSempoint, int finalSempoint) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblDetailregisterclass detailregisterclass=new TblDetailregisterclass();
            detailregisterclass.setIdRegister(idRegister);
            detailregisterclass.setIdSchedule(idSchedule);
            detailregisterclass.setClassCode(classCode);
            detailregisterclass.setTuition(tuition);
            detailregisterclass.setMidSemPoint(midSempoint);
            detailregisterclass.setFinalSemPoint(finalSempoint);
            detailregisterclass.setStt(Constants.CREATED);
            detailregisterclass.setTimeModified(Commons.getCurrentTime());
            session.save(detailregisterclass);
            session.getTransaction().commit();
            return  true;
        }catch (Exception ex){
            System.out.println("Loi:"+ ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, int midSempoint, int finalSempoint) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="from  TblDetailregisterclass e where  e.idRegister="+idRegister +" and e.idSchedule="+ idSchedule;
            Query<TblDetailregisterclass> query= session.createQuery(hql);
            List<TblDetailregisterclass> list= query.list();
            TblDetailregisterclass detailregisterclass=list.get(0);
            detailregisterclass.setClassCode(classCode);
            detailregisterclass.setTuition(tuition);
            detailregisterclass.setMidSemPoint(midSempoint);
            detailregisterclass.setFinalSemPoint(finalSempoint);
            session.save(detailregisterclass);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteDetailRegisterClassDao(int idRegister, int idSchedule) {

        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="from  TblDetailregisterclass e where  e.idRegister="+idRegister +" and e.idSchedule="+ idSchedule;
            Query<TblDetailregisterclass> query= session.createQuery(hql);
            List<TblDetailregisterclass> list= query.list();
            TblDetailregisterclass detailregisterclass=list.get(0);
            detailregisterclass.setStt(Constants.DELETED);
            detailregisterclass.setTimeModified(Commons.getCurrentTime());
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean ermanentlyDetailRegisterClassDao(int idRegister, int idSchedule) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="delete TblDetailregisterclass e where  e.idRegister="+idRegister +" and e.idSchedule="+idSchedule;
            Query query= session.createQuery(hql);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    @Override
    public List showInfoClass(String classCode) {
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="select * from TblDetailregisterclass e, TblSchedule s where e.classCode="+classCode;
            Query query= session.createQuery(hql);
            List list= query.list();
            return list;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }
}
