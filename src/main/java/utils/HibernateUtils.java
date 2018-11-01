/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystemPro, utils - IntelliJ IDEA
 * HibernateUtils.java, 21/10/2018 Trung Hieu Bui (Mr)
 */
package src.main.java.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

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
            // create service registry from cfg.cfg.xml
            org.hibernate.service.ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("cfg/hibernate.cfg.xml").build();

            //create metadata source from ServiceRegistry
            org.hibernate.boot.Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

            return metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static org.hibernate.SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static void shutdown() {
        // Remove cache và Connection Pools.
        getSessionFactory().close();
    }
}
