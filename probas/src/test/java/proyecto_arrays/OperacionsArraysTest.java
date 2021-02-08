
package proyecto_arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


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
        assertTrue(result);       
    }

    @Test
    public void CadenaSinLetra () {
        System.out.println("Letra que no está en una cadena ordenada");
        char letra = 'z';
        char [] cadena = {'a','b', 'c', 'd', 'e', 'f'};
        OperacionsArrays instance = new OperacionsArrays ();
        boolean result = instance.busca(letra,cadena);
        assertFalse(result);
    }

    @Test
    public void CadenaDesordenada () throws Exception {
        System.out.println("Letra que está en una cadena desordenada");
        char letra = 'a';
        char [] cadena = {'z','a', 'b', 'c', 'd'};
        OperacionsArrays instance = new OperacionsArrays ();
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute () throws Throwable{
                instance.busca(letra,cadena);
            }
        });
    }

    @Test
    public void CadenaMasDeDiez () throws Exception {
        System.out.println("Letra que está en una cadena de más de 10 elementos");
        char letra = 'a';
        char [] cadena = {'a','b', 'c', 'd', 'e', 'f','g','h','i','j','k'};
        OperacionsArrays instance = new OperacionsArrays ();
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute () throws Throwable{
                instance.busca(letra,cadena);
            }
        });
    }

    @Test
    public void CadenaLimiteUnElemento () {
        System.out.println("Letra en una cadena de un solo elemento");
        char letra = 'a';
        char [] cadena = {'a'};
        OperacionsArrays instance = new OperacionsArrays ();
        boolean result = instance.busca(letra,cadena);
        assertTrue(result); 
    }

    @Test
    public void CadenaLimiteVacia () {
        System.out.println("Letra en una cadena de un solo elemento");
        char letra = 'a';
        char [] cadena = {};
        OperacionsArrays instance = new OperacionsArrays ();
        boolean result = instance.busca(letra,cadena);
        assertFalse(result); 
    }

    @Test
    public void CadenaLetraInicio (){
        System.out.println("Letra al inicio de una cadena");
        char letra = 'a';
        char [] cadena = {'a','b', 'c', 'd', 'e', 'f'};
        OperacionsArrays instance = new OperacionsArrays ();
        boolean result = instance.busca(letra,cadena);
        assertTrue(result);
    }

    @Test
    public void CadenaLetraFin (){
        System.out.println("Letra al inicio de una cadena");
        char letra = 'f';
        char [] cadena = {'a','b', 'c', 'd', 'e', 'f'};
        OperacionsArrays instance = new OperacionsArrays ();
        boolean result = instance.busca(letra,cadena);
        assertTrue(result);
    }
}
