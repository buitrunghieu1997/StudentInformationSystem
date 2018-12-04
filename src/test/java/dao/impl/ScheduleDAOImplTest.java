/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entities.TblVSchedule;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vuduchiep
 */
public class ScheduleDAOImplTest {
    
    public ScheduleDAOImplTest() {
    }

    /**
     * Test of add method, of class ScheduleDAOImpl.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String idSubject = "";
        int idSchedule = 0;
        String room = "";
        String time = "";
        Integer startWeek = null;
        Integer size = null;
        Integer maxSize = null;
        Integer status = null;
        Integer stt = null;
        ScheduleDAOImpl instance = new ScheduleDAOImpl();
        boolean expResult = false;
        boolean result = instance.add(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ScheduleDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String idSubject = "";
        int idSchedule = 0;
        String room = "";
        String time = "";
        Integer startWeek = null;
        Integer size = null;
        Integer maxSize = null;
        Integer status = null;
        Integer stt = null;
        ScheduleDAOImpl instance = new ScheduleDAOImpl();
        boolean expResult = false;
        boolean result = instance.update(idSubject, idSchedule, room, time, startWeek, size, maxSize, status, stt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ScheduleDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int idSchedule = 0;
        ScheduleDAOImpl instance = new ScheduleDAOImpl();
        boolean expResult = false;
        boolean result = instance.delete(idSchedule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySchedule method, of class ScheduleDAOImpl.
     */
    @Test
    public void testDisplaySchedule() {
        System.out.println("displaySchedule");
        int idStudent = 0;
        ScheduleDAOImpl instance = new ScheduleDAOImpl();
        List<TblVSchedule> expResult = null;
        List<TblVSchedule> result = instance.displaySchedule(idStudent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
