package dao.impl;

import dao.RegisterSubjectDao;

import entities.TblDetailsubject;
import entities.TblSubjectregister;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import src.main.java.entities.TblRegistersubject;
import utils.Commons;
import utils.Constants;
import utils.HibernateUtils;

import java.util.List;

/**
 *
 * @author buiminhhieu
 */
public class RegisterSubjectDaoImpl implements RegisterSubjectDao {
    /**
     * Phuong thuc nay dung de them du lieu trong bang register subject trong db
     * @param idStudent ma so sinh vien
     * @param semester hoc ki
     * @return boolean neu them thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean addRegisterSubject(int idRegister,int idStudent, String semester) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubjectregister registersubject= new TblSubjectregister();
            registersubject.setIdRegister(idRegister);
            registersubject.setIdRegister(idStudent);
            registersubject.setCredit(0);
            registersubject.setSemester(semester);
            registersubject.setMaxCredit(Constants.maxCreditRegister);
            registersubject.setStt(Constants.CREATED);
            registersubject.setTimeModified(Commons.getCurrentTime());
            session.save(registersubject);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung de update tin chi hien tai dang dang ki trong bang register subject trong db
     * @param idRegister ma dang ki
     * @param credit tong so tin chi dang ki hien tai
     * @return boolean neu update thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean updateCredit(int idRegister, int credit) {
        SessionFactory factory =HibernateUtils.getSessionFactory();
        Session session =factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubjectregister subjectregister= session.get(TblSubjectregister.class,idRegister);
            subjectregister.setCredit(credit);
            session.save(subjectregister);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung du xoa dang ki tin chi cua sinh vien mot cach tam thoi bang cach danh dau stt='DELETE'
     * @param idRegister ma dang ki
     * @return boolean neu xoa dang ki thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean deleteRegisterSubject(int idRegister) {
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubjectregister subjectregister= session.get(TblSubjectregister.class,idRegister);
            subjectregister.setTimeModified(Commons.getCurrentTime());
            subjectregister.setStt(Constants.DELETED);
            session.save(subjectregister);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi:"+ ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung de xoa han cac dang ki cua sinh vien tron db
     * @param idRegister ma dang ki
     * @return boolean neu xoa dang ki thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean ermanentlyDeleteRegisterSubject(int idRegister){
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubjectregister subjectregister= session.get(TblSubjectregister.class,idRegister);
            session.delete(subjectregister);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay de kiem tra xem sinh vien nay da duoc mo dang ki hay chua
     * @param idStudent
     * @param semester
     * @return
     */
    @Override
    public TblSubjectregister checkRegisterSubject(int idStudent, String semester) {
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="from TblSubjectregister e where e.idStudent="+ idStudent+ " and e.semester="+idStudent;
            Query query= session.createQuery(hql);
            List<TblSubjectregister> list=query.list();
            session.getTransaction().commit();
            if(list.size()>0){
                return list.get(0);
            }
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }

    /**
     * Phuong thuc nay de tra ve thong tin dang ki tin chi cua sinh vien trong hoc ki
     * @param idStudent ma so sinh vien
     * @param semester hoc ki
     * @return list tra ve danh sach nhung tin chi ma sinh vien nay da dang ki
     */
    @Override
    public List showRegisterSubject(int idStudent, String semester) {
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="from TblSubjectregister , TblDetailsubjectregister , TblSubject where  TblSubjectregister .idRegister= TblDetailsubjectregister.idRegister  and TblDetailsubjectregister.idSubject = TblSubject.idSubject and TblSubjectregister.idStudent="+ idStudent +" and TblSubjectregister.semester="+ semester;
            Query query= session.createQuery(hql);
            List list= query.list();
            session.getTransaction().commit();
            return  list;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }
}
