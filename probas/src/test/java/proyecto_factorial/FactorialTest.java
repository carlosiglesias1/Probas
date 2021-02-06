package proyecto_factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    
    public FactorialTest() {
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
    public void FactorialCero () throws Exception{
        System.out.println("Factorial0");
        byte numero = 0;
        Factorial instance = new Factorial();
        float expResult = 1;
        float result = instance.factorial(numero);
        assertEquals(expResult, result, 0.0F);
    }

    @Test
    public void FactorialUno () throws Exception{
        System.out.println("Factorial1");
        byte numero = 1;
        Factorial instance = new Factorial();
        float expResult = 1;
        float result = instance.factorial(numero);
        assertEquals(expResult, result, 0.0F);
    }

    @Test
    public void FactorialN () throws Exception{
        System.out.println("Factorial1");
        byte numero = 4;
        Factorial instance = new Factorial();
        float expResult = 24;
        float result = instance.factorial(numero);
        assertEquals(expResult, result, 0.0F);
    }

    @Test
    public void FactorialInválido () throws Exception{
        System.out.println("FactorialInválido");
        Factorial instance = new Factorial();
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute () throws Throwable{
                instance.factorial((byte)-1);
            }
        });
    }
    
    @Test
    public void FactorialLimite () throws Exception{
        System.out.println("FactorialLímite");
        byte numero = (byte)128;
        Factorial instance = new Factorial();
        float expResult = (float)3.8562048236258042173567706592346E+215;
        float result = instance.factorial(numero);
        assertEquals(expResult, result, 0.0F);
    }
}
