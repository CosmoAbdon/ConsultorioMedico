/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.InfoCli;
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
public class InfoCliDAOTest {
    
    public InfoCliDAOTest() {
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
     * Test of addInfoCli method, of class InfoCliDAO.
     */
    @Test
    public void testAddInfoCli() throws Exception {
        System.out.println("addInfoCli");
        InfoCli infocli = null;
        InfoCliDAO instance = new InfoCliDAO();
        Integer expResult = null;
        Integer result = instance.addInfoCli(infocli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateInfoCli method, of class InfoCliDAO.
     */
    @Test
    public void testUpdateInfoCli() throws Exception {
        System.out.println("updateInfoCli");
        InfoCli infocli = null;
        InfoCliDAO instance = new InfoCliDAO();
        instance.updateInfoCli(infocli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteInfoCli method, of class InfoCliDAO.
     */
    @Test
    public void testDeleteInfoCli() throws Exception {
        System.out.println("deleteInfoCli");
        InfoCli infocli = null;
        InfoCliDAO instance = new InfoCliDAO();
        instance.deleteInfoCli(infocli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
