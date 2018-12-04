/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entities.TblDetaillearningchart;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vuduchiep
 */
public class DetailLearningChartDAOImplTest {
    
    public DetailLearningChartDAOImplTest() {
    }

    /**
     * Test of delete method, of class DetailLearningChartDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int idLearningChart = 0;
        DetailLearningChartDAOImpl instance = new DetailLearningChartDAOImpl();
        boolean expResult = false;
        boolean result = instance.delete(idLearningChart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class DetailLearningChartDAOImpl.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int idLearningChart = 0;
        DetailLearningChartDAOImpl instance = new DetailLearningChartDAOImpl();
        List<TblDetaillearningchart> expResult = null;
        List<TblDetaillearningchart> result = instance.search(idLearningChart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DetailLearningChartDAOImpl.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int idLearningChart = 0;
        String idSubject = "";
        String semester = "";
        Integer credit = null;
        Integer stt = null;
        DetailLearningChartDAOImpl instance = new DetailLearningChartDAOImpl();
        boolean expResult = false;
        boolean result = instance.add(idLearningChart, idSubject, semester, credit, stt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DetailLearningChartDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int idLearningChart = 0;
        String idSubject = "";
        String semester = "";
        Integer credit = null;
        Integer stt = null;
        DetailLearningChartDAOImpl instance = new DetailLearningChartDAOImpl();
        boolean expResult = false;
        boolean result = instance.update(idLearningChart, idSubject, semester, credit, stt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
