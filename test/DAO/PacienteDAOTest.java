/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Paciente;
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
public class PacienteDAOTest {
    
    public PacienteDAOTest() {
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
     * Test of addPaciente method, of class PacienteDAO.
     */
    @Test
    public void testAddPaciente() throws Exception {
        System.out.println("addPaciente");
        Paciente paciente = null;
        PacienteDAO instance = new PacienteDAO();
        Integer expResult = null;
        Integer result = instance.addPaciente(paciente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePaciente method, of class PacienteDAO.
     */
    @Test
    public void testUpdatePaciente() throws Exception {
        System.out.println("updatePaciente");
        Paciente paciente = null;
        PacienteDAO instance = new PacienteDAO();
        instance.updatePaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePaciente method, of class PacienteDAO.
     */
    @Test
    public void testDeletePaciente() throws Exception {
        System.out.println("deletePaciente");
        Paciente paciente = null;
        PacienteDAO instance = new PacienteDAO();
        instance.deletePaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
