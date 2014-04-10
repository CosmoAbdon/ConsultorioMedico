/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class GenericDAOTest {
    
    public GenericDAOTest() {
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
     * Test of getConnection method, of class GenericDAO.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        GenericDAO instance = new GenericDAOImpl();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class GenericDAO.
     */
    @Test
    public void testGetStatement() throws Exception {
        System.out.println("getStatement");
        GenericDAO instance = new GenericDAOImpl();
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getprePreparedStatement method, of class GenericDAO.
     */
    @Test
    public void testGetprePreparedStatement() throws Exception {
        System.out.println("getprePreparedStatement");
        String sql = "";
        GenericDAO instance = new GenericDAOImpl();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.getprePreparedStatement(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeQuery method, of class GenericDAO.
     */
    @Test
    public void testExecuteQuery() throws Exception {
        System.out.println("executeQuery");
        String query = "";
        Object[] params = null;
        GenericDAO instance = new GenericDAOImpl();
        ResultSet expResult = null;
        ResultSet result = instance.executeQuery(query, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeComand method, of class GenericDAO.
     */
    @Test
    public void testExecuteComand() throws Exception {
        System.out.println("executeComand");
        String query = "";
        Object[] params = null;
        GenericDAO instance = new GenericDAOImpl();
        int expResult = 0;
        int result = instance.executeComand(query, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GenericDAOImpl extends GenericDAO {
    }
}
