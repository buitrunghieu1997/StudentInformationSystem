/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entities.TblDepartment;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vuduchiep
 */
public class DepartmentDAOImplTest {
    
    public DepartmentDAOImplTest() {
    }

    /**
     * Test of insert method, of class DepartmentDAOImpl.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int idDepartment = 0;
        String name = "";
        String description = "";
        DepartmentDAOImpl instance = new DepartmentDAOImpl();
        boolean expResult = false;
        boolean result = instance.insert(idDepartment, name, description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DepartmentDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int idDepartment = 0;
        String name = "";
        String desciption = "";
        DepartmentDAOImpl instance = new DepartmentDAOImpl();
        boolean expResult = false;
        boolean result = instance.update(idDepartment, name, desciption);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DepartmentDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int idDepartment = 0;
        DepartmentDAOImpl instance = new DepartmentDAOImpl();
        boolean expResult = false;
        boolean result = instance.delete(idDepartment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class DepartmentDAOImpl.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int idDepartment = 0;
        DepartmentDAOImpl instance = new DepartmentDAOImpl();
        List<TblDepartment> expResult = null;
        List<TblDepartment> result = instance.search(idDepartment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
