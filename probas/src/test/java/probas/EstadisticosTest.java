/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probas;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carlos.iglesiasgomez
 */
public class EstadisticosTest {

    public EstadisticosTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of factorial method, of class Estadisticos.
     */
    @org.junit.jupiter.api.Test
    public void testFactorial() throws Exception {
        System.out.println("factorial");
        int x = 0;
        Estadisticos instance = new Estadisticos(10, 2);
        double expResult = 1.0;
        double result = instance.factorial(x);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of combinaciones method, of class Estadisticos.
     */
    @org.junit.jupiter.api.Test
    public void testCombinaciones() throws Exception {
        System.out.println("combinaciones");
        Estadisticos instance = new Estadisticos(0, 0);
        double expResult = 1.0;
        double result = instance.combinaciones();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of variaciones method, of class Estadisticos.
     */
    @org.junit.jupiter.api.Test
    public void testVariaciones() throws Exception {
        System.out.println("variaciones");
        Estadisticos instance = new Estadisticos(0, 0);
        double expResult = 1.0;
        double result = instance.variaciones();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of variac_repet method, of class Estadisticos.
     */
    @org.junit.jupiter.api.Test
    public void testVariac_repet() throws Exception {
        System.out.println("variac_repet");
        Estadisticos instance = new Estadisticos(0, 0);
        double expResult = 1.0;
        double result = instance.variac_repet();
        assertEquals(expResult, result, 0.0);

    }

}
