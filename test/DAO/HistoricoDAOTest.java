/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Historico;
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
public class HistoricoDAOTest {
    
    public HistoricoDAOTest() {
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
     * Test of addHistorico method, of class HistoricoDAO.
     */
    @Test
    public void testAddHistorico() throws Exception {
        System.out.println("addHistorico");
        Historico historico = null;
        HistoricoDAO instance = new HistoricoDAO();
        Integer expResult = null;
        Integer result = instance.addHistorico(historico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateHistorico method, of class HistoricoDAO.
     */
    @Test
    public void testUpdateHistorico() throws Exception {
        System.out.println("updateHistorico");
        Historico historico = null;
        HistoricoDAO instance = new HistoricoDAO();
        instance.updateHistorico(historico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteHistorico method, of class HistoricoDAO.
     */
    @Test
    public void testDeleteHistorico() throws Exception {
        System.out.println("deleteHistorico");
        Historico historico = null;
        HistoricoDAO instance = new HistoricoDAO();
        instance.deleteHistorico(historico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
