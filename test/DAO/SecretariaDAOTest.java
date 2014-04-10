/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Secretaria;
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
public class SecretariaDAOTest {
    
    public SecretariaDAOTest() {
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
     * Test of addSecretaria method, of class SecretariaDAO.
     */
    @Test
    public void testAddSecretaria() throws Exception {
        System.out.println("addSecretaria");
        Secretaria secretaria = null;
        SecretariaDAO instance = new SecretariaDAO();
        Integer expResult = null;
        Integer result = instance.addSecretaria(secretaria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSecretaria method, of class SecretariaDAO.
     */
    @Test
    public void testUpdateSecretaria() throws Exception {
        System.out.println("updateSecretaria");
        Secretaria secretaria = null;
        SecretariaDAO instance = new SecretariaDAO();
        instance.updateSecretaria(secretaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSecretaria method, of class SecretariaDAO.
     */
    @Test
    public void testDeleteSecretaria() throws Exception {
        System.out.println("deleteSecretaria");
        Secretaria secretaria = null;
        SecretariaDAO instance = new SecretariaDAO();
        instance.deleteSecretaria(secretaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecretaria method, of class SecretariaDAO.
     */
    @Test
    public void testGetSecretaria() throws Exception {
        System.out.println("getSecretaria");
        Secretaria secretaria = null;
        SecretariaDAO instance = new SecretariaDAO();
        Secretaria expResult = null;
        Secretaria result = instance.getSecretaria(secretaria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
