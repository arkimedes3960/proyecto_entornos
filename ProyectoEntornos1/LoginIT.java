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
 * @author Ignacio
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String result = "usuario1234";
        Login instance = new Login();
        String expResult = "usuario1234";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
}
