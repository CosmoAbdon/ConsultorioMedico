/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author zEveerY
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DAO.MedicosDAOTest.class, DAO.SecretariaDAOTest.class, DAO.ConsultasDAOTest.class, DAO.GenericDAOTest.class, DAO.AdminDAOTest.class, DAO.AgendaDAOTest.class, DAO.PacienteDAOTest.class, DAO.InfoCliDAOTest.class, DAO.PlanosConvenioDAOTest.class, DAO.HistoricoDAOTest.class, DAO.ConvenioDAOTest.class})
public class DAOSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
