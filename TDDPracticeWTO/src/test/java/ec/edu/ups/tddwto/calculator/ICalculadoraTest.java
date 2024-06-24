package ec.edu.ups.tddwto.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculadoraTest {

    @Test
    public void givenTwoIntWhenAdditionThenOk(){
        //System.out.println("Prueba Mockito Suma");
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.additionTwoInt(3,2)).thenReturn(5);
        assertEquals(5, c.additionTwoInt(2,3));
    }

    @Test
    public void givenTwoIntWhenSubstractionThenOk(){
        //System.out.println("Prueba Mockito Suma");
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.subtractionTwoInt (3,2)).thenReturn(1);
        assertEquals(1, c.subtractionTwoInt(3,2));
    }

    @Test
    public void givenTwoIntWhenMultiplicationThenOk(){
        //System.out.println("Prueba Mockito Suma");
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.multiplicationTwoInt(3,2)).thenReturn(6);
        assertEquals(6, c.multiplicationTwoInt(3,2));
    }

    @Test
    public void givenTwoIntWhenDivisionThenOk(){
        //System.out.println("Prueba Mockito Suma");
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.divisionTwoInt(3,1)).thenReturn(3);
        assertEquals(3, c.divisionTwoInt(3,1));
    }

}
//Min 45:38 https://avac.ups.edu.ec/posgrados/course/view.php?id=2478#section-2