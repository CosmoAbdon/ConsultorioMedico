/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Medicos;
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
public class MedicosDAOTest {
    
    public MedicosDAOTest() {
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
     * Test of addMedicos method, of class MedicosDAO.
     */
    @Test
    public void testAddMedicos() throws Exception {
        System.out.println("addMedicos");
        Medicos medicos = null;
        MedicosDAO instance = new MedicosDAO();
        Integer expResult = null;
        Integer result = instance.addMedicos(medicos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMedicos method, of class MedicosDAO.
     */
    @Test
    public void testUpdateMedicos() throws Exception {
        System.out.println("updateMedicos");
        Medicos medicos = null;
        MedicosDAO instance = new MedicosDAO();
        instance.updateMedicos(medicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMedicos method, of class MedicosDAO.
     */
    @Test
    public void testDeleteMedicos() throws Exception {
        System.out.println("deleteMedicos");
        Medicos medicos = null;
        MedicosDAO instance = new MedicosDAO();
        instance.deleteMedicos(medicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
