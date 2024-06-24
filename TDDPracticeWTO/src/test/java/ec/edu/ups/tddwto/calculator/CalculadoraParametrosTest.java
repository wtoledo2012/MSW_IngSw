package ec.edu.ups.tddwto.calculator;

import ec.edu.ups.tddwto.calculator.Calculadora;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculadoraParametrosTest {
    private int a,b,expected,cont;

    public CalculadoraParametrosTest(int a, int b, int expected, int cont) {
        this.a = a;
        this.b = b;
        this.expected = expected;
        this.cont = cont;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parametros (){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1,5,6,1});
        objects.add(new Object[]{3,5,8,2});
        objects.add(new Object[]{8,3,11,3});
        objects.add(new Object[]{4,9,13,4});
        objects.add(new Object[]{1,9,10,5});
        objects.add(new Object[]{1,1,2,6});
        return objects;
    }
    @Test
    public void givenTwoIntWhenAdditionThenOk(){
        System.out.println("Prueba " + String.valueOf(cont));
        Calculadora c = new Calculadora();
        assertEquals(expected, c.additionTwoInt(a,b));
    }
}