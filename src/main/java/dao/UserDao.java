/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystemPro, dao - IntelliJ IDEA
 * UserDao.java, 21/10/2018 Trung Hieu Bui (Mr)
 */
package dao;

import entities.TblAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import utils.Commons;
import utils.Constants;
import utils.HibernateUtils;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */
public class UserDao {
    private static final Logger logger = Logger.getLogger(UserDao.class.getName());

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session        session = factory.getCurrentSession();

        try {
            session.getTransaction().begin();
            String            sql      = "select e from " + TblAccount.class.getName() + " e";
            Query<TblAccount> query    = session.createQuery(sql);
            List<TblAccount>  accounts = query.getResultList();
            for (TblAccount account : accounts) {
                System.out.println(account.getIdAccount() + " "
                                   + account.getUsername() + " "
                                   + account.getPassword());
            }
            TblAccount tblAccount = new TblAccount();
            tblAccount.setIdAccount(2);
            tblAccount.setIdPermission(1);
            tblAccount.setPassword("critical");
            tblAccount.setUsername("hieuhust");
            tblAccount.setTimeModified(Commons.getCurrentTime());
            tblAccount.setStt(Constants.CREATED);

            session.persist(tblAccount);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
            session.getTransaction().rollback();
        }
    }
}
