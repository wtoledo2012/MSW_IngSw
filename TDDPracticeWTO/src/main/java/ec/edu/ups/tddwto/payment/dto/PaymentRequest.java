package ec.edu.ups.tddwto.payment.dto;

// Objeto de Solicitud
public class PaymentRequest {
    private double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
