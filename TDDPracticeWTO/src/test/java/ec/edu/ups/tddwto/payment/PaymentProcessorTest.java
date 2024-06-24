package ec.edu.ups.tddwto.payment;

import ec.edu.ups.tddwto.payment.dto.PaymentResponse;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway gateway = null;
    private PaymentProcessor processor = null;

    @Before
    public void setUp(){
        gateway = Mockito.mock(PaymentGateway.class);
        processor = new PaymentProcessor(gateway);
    }
    @Test
    public void testMakePaymentWhenIsCorrectThenOK() {

        Mockito.when(gateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(processor.makePayment(100));
    }

    @Test
    public void testMakePaymentWhenIsIncorrectThenError() {
        Mockito.when(gateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(processor.makePayment(100));
    }
}