/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entities.TblStudent;
import entities.TblVPersonalscoreboard;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author vuduchiep
 */
public class StudentDaoImplTest {
	
	public StudentDaoImplTest() {
	}
	
	/**
	 * Test of checkStudent method, of class StudentDaoImpl.
	 */
	@Test
	public void testCheckStudent() {
		System.out.println("checkStudent");
		int            idStudent = 0;
		StudentDaoImpl instance  = new StudentDaoImpl();
		boolean        expResult = false;
		boolean        result    = instance.checkStudent(idStudent);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of showMark method, of class StudentDaoImpl.
	 */
	@Test
	public void testShowMark() {
		System.out.println("showMark");
		int            idStudent = 0;
		StudentDaoImpl instance  = new StudentDaoImpl();
		List           expResult = null;
		List           result    = instance.showMark(idStudent);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of searchTuition method, of class StudentDaoImpl.
	 */
	@Test
	public void testSearchTuition() {
		System.out.println("searchTuition");
		int            idStudent = 0;
		String         semester  = "";
		StudentDaoImpl instance  = new StudentDaoImpl();
		int            expResult = 0;
		int            result    = instance.searchTuition(idStudent, semester);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of searchStudent method, of class StudentDaoImpl.
	 */
	@Test
	public void testSearchStudent() {
		System.out.println("searchStudent");
		int            idStudent = 0;
		StudentDaoImpl instance  = new StudentDaoImpl();
		TblStudent     expResult = null;
		TblStudent     result    = instance.searchStudent(idStudent);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of displayPersonalScoreboard method, of class StudentDaoImpl.
	 */
	@Test
	public void testDisplayPersonalScoreboard() {
		System.out.println("displayPersonalScoreboard");
		int                          idStudent = 0;
		StudentDaoImpl               instance  = new StudentDaoImpl();
		List<TblVPersonalscoreboard> expResult = null;
		List<TblVPersonalscoreboard> result    = instance.displayPersonalScoreboard(idStudent);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
