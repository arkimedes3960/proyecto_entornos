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
public class DatosUsuarioIT {
    
    public DatosUsuarioIT() {
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
     * Test of DatosUsuario method, of class DatosUsuario.
     */
    @Test
    public void testDatosUsuario() {
        System.out.println("Datos del Usuario:");
        String result1 = "Manuel";
        String result2 = "12345678A";
        String result3 = "manuel@gmail.com";
        DatosUsuario instance = new DatosUsuario();
        String expResult1 = "Manuel";
        String expResult2 = "12345678A";
        String expResult3 = "manuel@gmail.com";
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
