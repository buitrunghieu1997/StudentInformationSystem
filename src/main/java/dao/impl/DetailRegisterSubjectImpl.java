package dao.impl;

import dao.DetailRegisterSubject;
import entities.TblDetailregistersubject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;
//Bui Minh Hieu
public class DetailRegisterSubjectImpl implements DetailRegisterSubject {
    @Override
    public boolean addDetailRegisterSubject(int idRegister, int idDetailRegister, Integer idSubject) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblDetailregistersubject detailRegisterSubject=new TblDetailregistersubject();
            detailRegisterSubject.setIdRegister(idRegister);
            detailRegisterSubject.setIdDetailRegister(idDetailRegister);
            detailRegisterSubject.setIdSubject(idSubject);
            session.save(detailRegisterSubject);
            session.getTransaction().commit();
            System.out.println("Them chi tiet dang ki hoc phan thanh cong");
            return true;
        }catch (Exception ex){
            System.out.println("Them chi tiet dang ki hoc phan khong thanh cong");
            System.out.println("Loi: "+  ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteDetailRegisterSubject(int idDetailRegister) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblDetailregistersubject tblDetailregistersubject= session.get(TblDetailregistersubject.class,idDetailRegister);
            session.delete(tblDetailregistersubject);
            session.getTransaction().commit();
            System.out.println("Xoa chi tiet dang ki hoc phan thanh cong");
            return true;
        }catch (Exception ex){
            System.out.println("Xoa chi tiet dang ki hoc phan khong thanh cong");
        }
        return false;
    }
}
