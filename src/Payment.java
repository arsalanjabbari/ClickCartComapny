public class Payment {

    private PAY paymentStatus;

    public Payment() {
        this.paymentStatus = PAY.UNPAID;
    }

    public PAY getPaymentStatus() {
        return paymentStatus;
    }

    // Method to request payment
    public void paymentRequest(double amount) {
        if (paymentStatus == PAY.UNPAID) {
            // Add logic for processing the payment request, e.g., interacting with a payment gateway
            System.out.println("Payment requested for amount: $" + amount);
            // Assume the payment is successful for simplicity
            paymentStatus = PAY.PAID;
            System.out.println("Payment successful. Payment status: " + paymentStatus);
        } else {
            System.out.println("Payment has already been processed. Payment status: " + paymentStatus);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentStatus=" + paymentStatus +
                '}';
    }

}
