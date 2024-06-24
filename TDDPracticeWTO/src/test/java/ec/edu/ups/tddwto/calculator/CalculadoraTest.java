package ec.edu.ups.tddwto.calculator;

import ec.edu.ups.tddwto.calculator.Calculadora;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Prueba setUpClass()");
    }
    @Before
    public void setUp(){
        c = new Calculadora();
    }
    @Test
    public void givenTwoIntWhenAdditionThenOk(){
        System.out.println("Prueba Suma");
        assertEquals(5, c.additionTwoInt(3,2));
    }

    @Test
    public void givenTwoIntWhenSubtractionThenOk(){
        System.out.println("Prueba Resta");
        assertEquals(1, c.subtractionTwoInt(3,2));
    }

    @Test(timeout = 150)
    public void givenTwoIntWhenMultiplicationThenOk(){
        System.out.println("Prueba Multiplicación");
        assertEquals(6, c.multiplicationTwoInt(3,2));
    }

    @Test
    public void givenTwoIntWhenDivisionThenOk(){
        System.out.println("Prueba División");
        assertEquals(3, c.divisionTwoInt(3,1));
    }

    @After
    public void tearDown(){
        //System.out.println("Prueba tearDown()");
        c.setAns(0);
        c= null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("Prueba tearDownClass()");
    }
}
