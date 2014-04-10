/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.PlanosConvenios;
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
public class PlanosConvenioDAOTest {
    
    public PlanosConvenioDAOTest() {
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
     * Test of addPlanosConvenios method, of class PlanosConvenioDAO.
     */
    @Test
    public void testAddPlanosConvenios() throws Exception {
        System.out.println("addPlanosConvenios");
        PlanosConvenios planosConvenios = null;
        PlanosConvenioDAO instance = new PlanosConvenioDAO();
        Integer expResult = null;
        Integer result = instance.addPlanosConvenios(planosConvenios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePlanosConvenios method, of class PlanosConvenioDAO.
     */
    @Test
    public void testUpdatePlanosConvenios() throws Exception {
        System.out.println("updatePlanosConvenios");
        PlanosConvenios planosConvenios = null;
        PlanosConvenioDAO instance = new PlanosConvenioDAO();
        instance.updatePlanosConvenios(planosConvenios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePlanosConvenios method, of class PlanosConvenioDAO.
     */
    @Test
    public void testDeletePlanosConvenios() throws Exception {
        System.out.println("deletePlanosConvenios");
        PlanosConvenios planosConvenios = null;
        PlanosConvenioDAO instance = new PlanosConvenioDAO();
        instance.deletePlanosConvenios(planosConvenios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
