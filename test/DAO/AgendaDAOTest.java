/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Agenda;
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
public class AgendaDAOTest {
    
    public AgendaDAOTest() {
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
     * Test of addAgenda method, of class AgendaDAO.
     */
    @Test
    public void testAddAgenda() throws Exception {
        System.out.println("addAgenda");
        Agenda agenda = null;
        AgendaDAO instance = new AgendaDAO();
        Integer expResult = null;
        Integer result = instance.addAgenda(agenda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAgenda method, of class AgendaDAO.
     */
    @Test
    public void testUpdateAgenda() throws Exception {
        System.out.println("updateAgenda");
        Agenda agenda = null;
        AgendaDAO instance = new AgendaDAO();
        instance.updateAgenda(agenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAgenda method, of class AgendaDAO.
     */
    @Test
    public void testDeleteAgenda() throws Exception {
        System.out.println("deleteAgenda");
        Agenda agenda = null;
        AgendaDAO instance = new AgendaDAO();
        instance.deleteAgenda(agenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
