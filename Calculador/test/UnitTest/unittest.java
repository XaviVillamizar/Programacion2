/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package UnitTest;

import GUI.operaciones;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author xavis
 */
public class unittest {
    
    public unittest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        @Test
    public void testSuma() {
        assertEquals("5.0", operaciones.calcular("2", "3", "+"));
    }

    @Test
    public void testResta() {
        assertEquals("1.0", operaciones.calcular("3", "2", "-"));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals("6.0", operaciones.calcular("2", "3", "*"));
    }

    @Test
    public void testDivision() {
        assertEquals("2.0", operaciones.calcular("6", "3", "/"));
    }

    @Test
    public void testModulo() {
        assertEquals("1.0", operaciones.calcular("5", "2", "%"));
    }

   //@Test(expected = NumberFormatException.class)
    public void testDivisionPorCero() {
        operaciones.calcular("5", "0", "/");
    }
    
}
