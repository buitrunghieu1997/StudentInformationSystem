/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystemPro, utils - IntelliJ IDEA
 * HibernateUtils.java, 21/10/2018 Trung Hieu Bui (Mr)
 */
package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */
public class HibernateUtils {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    /**
     * Hibernate 5
     *
     * @return metadata.getSessionFactoryBuilder.build()
     */
    private static SessionFactory buildSessionFactory() {
        try {
	        Configuration cfg = new Configuration();
	        cfg.configure("cfg/hibernate.cfg.xml"); //hibernate config xml file name
	        cfg.getProperties().setProperty("hibernate.connection.password", Constants.PASSWORD);
	        cfg.getProperties().setProperty("hibernate.connection.username", Constants.USERNAME);
	        return cfg.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	
	public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static void shutdown() {
        // Remove cache và Connection Pools.
        getSessionFactory().close();
    }
}
