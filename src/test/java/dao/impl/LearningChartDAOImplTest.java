/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entities.TblLearningchart;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vuduchiep
 */
public class LearningChartDAOImplTest {
    
    public LearningChartDAOImplTest() {
    }

    /**
     * Test of add method, of class LearningChartDAOImpl.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int idLearningChart = 0;
        Integer idStudent = null;
        Integer totalCredit = null;
        LearningChartDAOImpl instance = new LearningChartDAOImpl();
        boolean expResult = false;
        boolean result = instance.add(idLearningChart, idStudent, totalCredit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LearningChartDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int idLearningChart = 0;
        Integer idStudent = null;
        Integer totalCredit = null;
        LearningChartDAOImpl instance = new LearningChartDAOImpl();
        boolean expResult = false;
        boolean result = instance.update(idLearningChart, idStudent, totalCredit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LearningChartDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int idLearningChart = 0;
        LearningChartDAOImpl instance = new LearningChartDAOImpl();
        boolean expResult = false;
        boolean result = instance.delete(idLearningChart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class LearningChartDAOImpl.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int idLearningChart = 0;
        LearningChartDAOImpl instance = new LearningChartDAOImpl();
        List<TblLearningchart> expResult = null;
        List<TblLearningchart> result = instance.search(idLearningChart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
