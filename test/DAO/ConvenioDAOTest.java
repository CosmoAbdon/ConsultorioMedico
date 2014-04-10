/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Convenio;
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
public class ConvenioDAOTest {
    
    public ConvenioDAOTest() {
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
     * Test of addConvenio method, of class ConvenioDAO.
     */
    @Test
    public void testAddConvenio() throws Exception {
        System.out.println("addConvenio");
        Convenio convenio = null;
        ConvenioDAO instance = new ConvenioDAO();
        Integer expResult = null;
        Integer result = instance.addConvenio(convenio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateConvenio method, of class ConvenioDAO.
     */
    @Test
    public void testUpdateConvenio() throws Exception {
        System.out.println("updateConvenio");
        Convenio convenio = null;
        ConvenioDAO instance = new ConvenioDAO();
        instance.updateConvenio(convenio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSecretaria method, of class ConvenioDAO.
     */
    @Test
    public void testDeleteSecretaria() throws Exception {
        System.out.println("deleteSecretaria");
        Convenio convenio = null;
        ConvenioDAO instance = new ConvenioDAO();
        instance.deleteSecretaria(convenio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
