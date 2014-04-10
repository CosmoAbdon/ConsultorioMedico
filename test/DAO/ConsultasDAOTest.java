/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Consultas;
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
public class ConsultasDAOTest {
    
    public ConsultasDAOTest() {
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
     * Test of addConsultas method, of class ConsultasDAO.
     */
    @Test
    public void testAddConsultas() throws Exception {
        System.out.println("addConsultas");
        Consultas consultas = null;
        ConsultasDAO instance = new ConsultasDAO();
        Integer expResult = null;
        Integer result = instance.addConsultas(consultas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateConsultas method, of class ConsultasDAO.
     */
    @Test
    public void testUpdateConsultas() throws Exception {
        System.out.println("updateConsultas");
        Consultas consultas = null;
        ConsultasDAO instance = new ConsultasDAO();
        instance.updateConsultas(consultas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteConsultas method, of class ConsultasDAO.
     */
    @Test
    public void testDeleteConsultas() throws Exception {
        System.out.println("deleteConsultas");
        Consultas consultas = null;
        ConsultasDAO instance = new ConsultasDAO();
        instance.deleteConsultas(consultas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
