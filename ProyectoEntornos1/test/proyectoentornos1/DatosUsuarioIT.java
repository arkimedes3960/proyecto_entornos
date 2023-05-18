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
        System.out.println("DatosUsuario");
        String Nombre = "Manuel";
        String dni = "00000000A";
        String email = "manuel@gmail.com";
        String n_introducido = "Manuel";
        String dni_introducido = "00000000A";
        String email_introducido = "manuel@gmail.com";
        boolean expResult = true;
        boolean result = DatosUsuario.DatosUsuario(Nombre, dni, email, n_introducido, dni_introducido, email_introducido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
