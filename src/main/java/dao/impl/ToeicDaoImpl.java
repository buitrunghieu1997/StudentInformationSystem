package dao.impl;

import dao.ToeicDao;
import entities.TblToeic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.sql.Date;
import java.util.List;

public class ToeicDaoImpl implements ToeicDao {

    public static void main(String[] args) {
        // SessionFactory factory = HibernateUtils.getSessionFactory();
        //  Session session = factory.getCurrentSession();
//    try{
//       // session.getTransaction().begin();
//        new ToeicDaoImpl().addToeic(20151290,"2015",new Date(2018,1,1),465);
//      // session.getTransaction().commit();
//    }catch (Exception ex){
//        System.out.println("Loi");
//    }
        // new ToeicDaoImpl().updateToeic(20151290,"2019",new Date(2018,5,1),550);
//    List danhSach=new ToeicDaoImpl().searchToeic(20151290);
//    Iterator iterator=danhSach.iterator();
//   {
//        TblToeic toeic= (TblToeic)iterator.next();
//       System.out.println(toeic.getIdstudent());
//        System.out.println("Co sanh sach");
//    } while (iterator.hasNext());
        // new ToeicDaoImpl().deleteToeic(20151290);

    }

    @Override
    public boolean addToeic(int idStudent, String semester, Date date, Integer point) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session        session = factory.getCurrentSession();
        try {
            session.getTransaction().begin();
            TblToeic toeic = new TblToeic();
            toeic.setIdstudent(idStudent);
            toeic.setSemester(semester);
            toeic.setDate(date);
            toeic.setPoint(point);
            session.save(toeic);
            session.getTransaction().commit();
            System.out.println("Them diem toeic thanh cong");
            return true;
        } catch (Exception ex) {
            // System.out.println("Thêm điểm toiec thất bài");
            System.out.println("Loi: " + ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteToeic(int idStudent) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session        session = factory.getCurrentSession();
        try {
            session.getTransaction().begin();
            TblToeic toeic = session.get(TblToeic.class, idStudent);
            session.delete(toeic);
            session.getTransaction().commit();
            System.out.println("Xoa diem toeic thanh cong");
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }

    @Override
    public boolean updateToeic(int idStudent, String semester, Date date, Integer point) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session        session = factory.getCurrentSession();
        try {
            session.getTransaction().begin();
            TblToeic toeic = session.get(TblToeic.class, idStudent);
            toeic.setSemester(semester);
            toeic.setDate(date);
            toeic.setPoint(point);
            session.save(toeic);
            session.getTransaction().commit();
            System.out.println("Update diem toeic thanh cong");
            return true;
        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
        return false;
    }

    @Override
    public List searchToeic(int idStudent) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session        session = factory.getCurrentSession();
        try {
            session.getTransaction().begin();
            String hql   = "FROM  TblToeic where idstudent=" + idStudent;
            Query  query = session.createQuery(hql);
            // query.setParameter("idstudent",idStudent);
            List list = query.list();
            return list;
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
        return null;
    }
}
