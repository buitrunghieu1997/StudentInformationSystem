/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entities.TblAccount;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author vuduchiep
 */
public class AccountDAOImplTest {
	
	public AccountDAOImplTest() {
	}
	
	/**
	 * Test of addAccount method, of class AccountDAOImpl.
	 */
	@Test
	public void testAddAccount() {
		System.out.println("addAccount");
		int            idAccount    = 0;
		String         username     = "";
		String         password     = "";
		Integer        idPermission = null;
		Integer        stt          = null;
		String         timeModified = "";
		AccountDAOImpl instance     = new AccountDAOImpl();
		boolean        expResult    = false;
		boolean        result       = instance.addAccount(idAccount, username, password, idPermission, stt, timeModified);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of deleteAccount method, of class AccountDAOImpl.
	 */
	@Test
	public void testDeleteAccount() {
		System.out.println("deleteAccount");
		int            idAccount = 0;
		AccountDAOImpl instance  = new AccountDAOImpl();
		boolean        expResult = false;
		boolean        result    = instance.deleteAccount(idAccount);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of changePassword method, of class AccountDAOImpl.
	 */
	@Test
	public void testChangePassword() {
		System.out.println("changePassword");
		String         username  = "";
		String         password  = "";
		AccountDAOImpl instance  = new AccountDAOImpl();
		boolean        expResult = false;
		boolean        result    = instance.changePassword(username, password);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of getAccount method, of class AccountDAOImpl.
	 */
	@Test
	public void testGetAccount() {
		System.out.println("getAccount");
		String           username  = "";
		String           password  = "";
		AccountDAOImpl   instance  = new AccountDAOImpl();
		List<TblAccount> expResult = null;
		List<TblAccount> result    = instance.getAccount(username, password);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
