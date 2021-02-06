package proyecto_division;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class DivisionTest {

    public DivisionTest() {

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
    public void testDivisionPositiva() throws Exception {
        System.out.println("calcularDivisionPositivos");
        float dividendo = 10.0F;
        float divisor = 5.0F;
        Division instance = new Division();
        float expResult = 2.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivisionNegativa () throws Exception {
        System.out.println("calcularDivisionNegativa");
        float dividendo = 10.0F;
        float divisor = -5.0F;
        Division instance = new Division();
        float expResult = -2.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivisionNula () throws Exception {
        System.out.println("calcularDivisionNula");
        Division instance = new Division();
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute () throws Throwable{
                instance.calcularDivision(5, 0);
            }
        });
    }

    @Test
    public void testDivisionCaracter () throws Exception {
        System.out.println("calcularDivisionCaracter");
        Division instance = new Division();
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute () throws Throwable{
                instance.calcularDivision('a', 1);
            }
        });
    }

    @Test
    public void testDivisorCaracter () throws Exception {
        System.out.println("calcularDivisorCaracter");
        Division instance = new Division();
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute () throws Throwable{
                instance.calcularDivision(5, 'b');
            }
        });
    }


}
