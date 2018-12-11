/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, services - IntelliJ IDEA
 * StartUpServices.java, 22/10/2018 Trung Hieu Bui (Mr)
 */
package services.startup;

import utils.HibernateUtils;

/**
 * What is this class usage?
 *
 * @author Trung Hieu Bui (Mr)
 */
public class StartUpServices implements Runnable {
	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override public void run() {
		HibernateUtils.getSessionFactory().getCurrentSession();
	}
}
