/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Admin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zEveerY
 */
public class AdminDAOTest {
    
    public AdminDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAdmin method, of class AdminDAO.
     */
    @Test
    public void testAddAdmin() throws Exception {
        System.out.println("addAdmin");
        Admin admin = null;
        AdminDAO instance = new AdminDAO();
        Integer expResult = null;
        Integer result = instance.addAdmin(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSAdmin method, of class AdminDAO.
     */
    @Test
    public void testUpdateSAdmin() throws Exception {
        System.out.println("updateSAdmin");
        Admin admin = null;
        AdminDAO instance = new AdminDAO();
        instance.updateSAdmin(admin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAdmin method, of class AdminDAO.
     */
    @Test
    public void testDeleteAdmin() throws Exception {
        System.out.println("deleteAdmin");
        Admin admin = null;
        AdminDAO instance = new AdminDAO();
        instance.deleteAdmin(admin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
