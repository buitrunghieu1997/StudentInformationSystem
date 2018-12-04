package dao.impl;

import dao.StudentDao;
import entities.TblStudent;
import entities.TblVPersonalscoreboard;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.Constants;
import utils.HibernateUtils;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean checkStudent(int idStudent) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblStudent student= session.get(TblStudent.class, idStudent);
            if(student !=null){
                return true;
            }
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    @Override
    public List showMark(int idStudent) {
        SessionFactory factory=HibernateUtils.getSessionFactory();
        Session session=factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="from TblRegisterclass , TblDetailregisterclass where TblRegisterclass .idRegister=TblDetailregisterclass .idRegister";
            Query query= session.createQuery(hql);
            List list= query.list();
            session.getTransaction().commit();
            return list;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }

    @Override
    public int searchTuition(int idStudent, String semester) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session =factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="select sum(TblDetailregisterclass.tuition) from TblRegisterclass , TblDetailregisterclass where TblRegisterclass.idRegister=TblDetailregisterclass.idRegister and TblRegisterclass.idStudent="+idStudent + " and TblRegisterclass.semester="+semester;
            Query query=session.createQuery(hql);
            List<Integer> list=query.list();
            session.getTransaction().commit();
            return list.get(0);
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return 0;
    }

    public TblStudent searchStudent(int idStudent){
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session =factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblStudent student=session.get(TblStudent.class,idStudent);
            return student;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex);
        }
        return null;
    }

    @Override
    public List<TblVPersonalscoreboard> displayPersonalScoreboard(int idStudent) {
        
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();

        try {
            session.getTransaction().begin();
            String hql = "from TblVPersonalscoreboard where idStudent = :idStudent";
            Query query = session.createQuery(hql);
            query.setParameter("idStudent",idStudent);
            List list = query.list();
            
            return list;
            
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
            return null;
        }
    }

}
