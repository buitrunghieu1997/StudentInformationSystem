/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DetailSubjectDAO;
import entities.TblDetailsubject;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.HibernateUtils;

/**
 *
 * @author vuduchiep
 */
public class DetailSubjectDaoImpl implements DetailSubjectDAO{

    @Override
    public boolean add(int idDetailSubject, String idSubject, String idSubjectParent, Integer creditSubject, Integer creditTuition, Integer lenght, String subjectCode) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        TblDetailsubject detailsubject = new TblDetailsubject();

        try {

            session.getTransaction().begin();
            detailsubject.setIdDetailSubject(idDetailSubject);
            detailsubject.setIdSubject(idSubject);
            detailsubject.setIdSubjectParent(idSubjectParent);
            detailsubject.setCreditSubject(creditSubject);
            detailsubject.setCreditTuition(creditTuition);
            detailsubject.setLenght(lenght);
            detailsubject.setSubjectCode(subjectCode);

            session.save(detailsubject);

            session.getTransaction().commit();

            return true;

        } catch (Exception ex) {

            System.out.println("Loi: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int idDetailSubject, String idSubject, String idSubjectParent, Integer creditSubject, Integer creditTuition, Integer lenght, String subjectCode) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        TblDetailsubject detailsubject = new TblDetailsubject();

        try {
            session.getTransaction().begin();
            detailsubject = session.get(TblDetailsubject.class, idDetailSubject);
            detailsubject.setIdSubject(idSubject);
            detailsubject.setIdSubjectParent(idSubjectParent);
            detailsubject.setCreditSubject(creditSubject);
            detailsubject.setCreditTuition(creditTuition);
            detailsubject.setLenght(lenght);
            detailsubject.setSubjectCode(subjectCode);

            session.update(detailsubject);
            session.getTransaction().commit();

            return true;
        } catch (Exception ex) {
            session.getTransaction().rollback();
            System.out.println("Loi: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int idDetailSubject) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        TblDetailsubject detailsubject = new TblDetailsubject();

        try {

            session.getTransaction().begin();
            detailsubject = session.get(TblDetailsubject.class, idDetailSubject);
            session.delete(detailsubject);
            session.getTransaction().commit();

            return true;

        } catch (Exception ex) {
            session.getTransaction().rollback();
            System.out.println("Loi: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public TblDetailsubject checkExistDetailSubject(int idDetailSubject) {

        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            String hql="from  TblDetailsubject e  where e.idDetailSubject="+idDetailSubject;
            Query query=session.createQuery(hql);
            List<TblDetailsubject> list= query.list();
            session.getTransaction().commit();
            if(list.size()>0)return list.get(0);
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }

    @Override
    public List<Object> displayListSubject() {

        // how to code ???^^
        
        return null;
    }
    
}
