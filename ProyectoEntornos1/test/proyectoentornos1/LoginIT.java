/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectoentornos1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class LoginIT {
    
    public LoginIT() {
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
     * Test of login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String Pass = "usuario";
        String Introducido = "usuari";
        boolean expResult = true;
        boolean result = Login.login(Pass, Introducido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
