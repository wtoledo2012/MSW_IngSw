package ec.edu.ups.tddwto.payment;

import ec.edu.ups.tddwto.payment.dto.PaymentRequest;
import ec.edu.ups.tddwto.payment.dto.PaymentResponse;

// Pasarela de Pago
public interface PaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);


}
