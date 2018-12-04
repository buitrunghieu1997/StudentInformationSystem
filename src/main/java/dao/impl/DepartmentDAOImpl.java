/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DepartmentDAO;
import entities.TblDepartment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtils;

/**
 *
 * @author vuduchiep
 */
public class DepartmentDAOImpl implements DepartmentDAO {

    @Override
    public boolean insert(int idDepartment, String name, String description) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        TblDepartment department = new TblDepartment();

        try {

            session.getTransaction().begin();

            department.setIdDepartment(idDepartment);
            department.setName(name);
            department.setDescription(description);

            session.save(department);

            session.getTransaction().commit();

            return true;

        } catch (Exception ex) {

            System.out.println("Loi: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int idDepartment, String name, String desciption) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        TblDepartment department = new TblDepartment();

        try {
            session.getTransaction().begin();
            department = session.get(TblDepartment.class, idDepartment);
            department.setName(name);
            department.setDescription(desciption);

            session.update(department);
            session.getTransaction().commit();

            return true;
        } catch (Exception ex) {
            session.getTransaction().rollback();
            System.out.println("Loi: " + ex.getMessage());
            return false;
        }

    }

    @Override
    public boolean delete(int idDepartment) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        TblDepartment department = new TblDepartment();

        try {

            session.getTransaction().begin();
            department = session.get(TblDepartment.class, idDepartment);
            session.delete(department);
            session.getTransaction().commit();

            return true;

        } catch (Exception ex) {
            session.getTransaction().rollback();
            System.out.println("Loi: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<TblDepartment> search(int idDepartment) {

        Session session = HibernateUtils.getSessionFactory().getCurrentSession();

        try {
            session.getTransaction().begin();
            String hql = "from TblDepartment where idDepartment = :idDepartment";
            Query query = session.createQuery(hql);
            query.setParameter("idDepartment",idDepartment);
            List list = query.list();
            
            return list;
            
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
            return null;
        }

    }

}
