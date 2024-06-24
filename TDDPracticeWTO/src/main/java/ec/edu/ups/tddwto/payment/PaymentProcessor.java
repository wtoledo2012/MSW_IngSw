package ec.edu.ups.tddwto.payment;

import ec.edu.ups.tddwto.payment.dto.PaymentRequest;
import ec.edu.ups.tddwto.payment.dto.PaymentResponse;

//Procesados de Pagos
public class PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment( double amount) {
        PaymentResponse resp = gateway.requestPayment(new PaymentRequest(amount));
        if(resp.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        } else {
            return false;
        }
    }
}
