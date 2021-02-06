/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carlo
 */
public class OperacionsArraysTest {
    
    public OperacionsArraysTest() {
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
    
    @Test
    public void CadenaOrdenada() {
        System.out.println("Letra en una cadena ordenada");
        char letra = 'c';
        char [] cadena = {'a','b', 'c', 'd', 'e', 'f'};
        OperacionsArrays instance = new OperacionsArrays ();
        boolean result = instance.busca(letra,cadena);
        boolean expResult = true;
        assertEquals(expResult, result);        
    }
}
