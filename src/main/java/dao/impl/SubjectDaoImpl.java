package dao.impl;

import dao.SubjectDao;
import entities.TblSubject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.Commons;
import utils.Constants;
import utils.HibernateUtils;


/**
 *
 * @author buiminhhieu
 */
public class SubjectDaoImpl implements SubjectDao {
    /**
     * Phuong thuc nay de them hoc phan vao trong db
     * @param idSubject ma hoc phan
     * @param idGenre khoa vien
     * @param name ten hoc phan
     * @param creditSubject tin chi hoc tap
     * @param creditTuition tin chi hoc phi
     * @param length
     * @return boolean neu them hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean addSubject(String idSubject, int idGenre, String name, Integer creditSubject, Integer creditTuition, int length) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession ();
        try{
            session.getTransaction().begin();
            TblSubject subject=new TblSubject();
            subject.setIdSubject(idSubject);
            subject.setIdGenre(idGenre);
            subject.setName(name);
            subject.setCreditSubject(creditSubject);
            subject.setCreditTuition(creditTuition);
            subject.setLenght(length);
            subject.setStt(Constants.CREATED);
            subject.setTimeModified(Commons.getCurrentTime());
            session.save(subject);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }


    /**
     * Phuong thuc nay de danh dau xoa hoc phan tam thoi bang cach cho thuoc tinh stt='DELETE'
     * @param idSubject ma hoc phan
     * @return boolean neu xoa hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean deleteSubject(String idSubject) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubject subject= session.get(TblSubject.class,idSubject);
            subject.setTimeModified(Commons.getCurrentTime());
            subject.setStt(Constants.DELETED);
            session.save(subject);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung de xoa han cac hoc phan
     * @param idSubject ma hoc phan
     * @return boolean neu xoa hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean ermanentlyDeleteSubject(String idSubject) {
        SessionFactory factory= HibernateUtils.getSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubject subject= session.get(TblSubject.class,idSubject);
            session.delete(subject);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi:"+ ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay dung de update cac thong tin cua hoc phan
     * @param idSubject ma hoc phan
     * @param idGenre ma khoa vien
     * @param name ten hoc phan
     * @param creditSubject tin chi hoc phan
     * @param creditTuition tin chi hoc phi
     * @param length
     * @return boolean neu update hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    @Override
    public boolean upateSubject(String idSubject,int idGenre, String name, Integer creditSubject, Integer creditTuition, int length) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubject subject= session.get(TblSubject.class,idSubject);
            subject.setIdGenre(idGenre);
            subject.setName(name);
            subject.setCreditSubject(creditSubject);
            subject.setCreditTuition(creditTuition);
            subject.setLenght(length);
            subject.setStt(Constants.UPDATE);
            subject.setTimeModified(Commons.getCurrentTime());
            session.save(subject);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return false;
    }

    /**
     * Phuong thuc nay tra ve thong tin cua subject can tim
     * @param idSubject ma hoc phan
     * @return TblSubject ket qua tra ve la doi tuong tblSubject
     */
    @Override
    public TblSubject searchSubject(String idSubject) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            TblSubject subject=session.get(TblSubject.class,idSubject);
            session.getTransaction().commit();
            return  subject;
        }catch (Exception ex){
            System.out.println("Loi: "+ ex.getMessage());
        }
        return null;
    }

    


}
