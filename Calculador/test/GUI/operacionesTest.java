/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xavis
 */
public class operacionesTest {
    
    public operacionesTest() {
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
     * Test of setValor1 method, of class operaciones.
     */
    @Test
    public void testSetValor1() {
        operaciones instance = new operaciones("", "", "");
        instance.setValor1("10");
        assertEquals("10", instance.getValor1());
    }

    @Test
    public void testGetValor1() {
        operaciones instance = new operaciones("10", "", "");
        assertEquals("10", instance.getValor1());
    }

    @Test
    public void testSetValor2() {
        operaciones instance = new operaciones("", "", "");
        instance.setValor2("5");
        assertEquals("5", instance.getValor2());
    }

    @Test
    public void testGetValor2() {
        operaciones instance = new operaciones("", "5", "");
        assertEquals("5", instance.getValor2());
    }

    @Test
    public void testSetOperacion() {
        operaciones instance = new operaciones("", "", "");
        instance.setOperacion("+");
        assertEquals("+", instance.getOperacion());
    }

    @Test
    public void testGetOperacion() {
        operaciones instance = new operaciones("", "", "+");
        assertEquals("+", instance.getOperacion());
    }

     @Test
    public void testCalcularSumaConDecimales() {
        operaciones instance = new operaciones("3.5", "2.5", "+");
        assertEquals("6.0", instance.calcular());
    }

    @Test
    public void testCalcularDivisionPorCero() {
        operaciones instance = new operaciones("10", "0", "/");
        assertEquals("Infinity", instance.calcular());
    }
    
    @Test
    public void testCalcularDivisionPorCero2() {
        operaciones instance = new operaciones("727", "0", "/");
        assertEquals("Infinity", instance.calcular());
    }

    @Test
    public void testCalcularMultiplicacionNegativa() {
        operaciones instance = new operaciones("-2", "3", "*");
        assertEquals("-6.0", instance.calcular());
    }

    
}
    

