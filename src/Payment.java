public class Payment {

    private PAY paymentStatus;

    public Payment() {
        this.paymentStatus = PAY.UNPAID;
    }

    public PAY getPaymentStatus() {
        return paymentStatus;
    }

    // Method to request payment
    public static boolean paymentRequest(Payment payment, double amount) {
        if (payment.getPaymentStatus() == PAY.UNPAID) {
            // Add logic for processing the payment request, e.g., interacting with a payment gateway
            System.out.println("Payment requested for amount: $" + amount);
            // Assume the payment is successful for simplicity
            payment.paymentStatus = PAY.PAID;
            System.out.println("Payment successful. Payment status: " + payment.getPaymentStatus());
        } else {
            System.out.println("Payment has already been processed. Payment status: " + payment.getPaymentStatus());
        }
        return true;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentStatus=" + getPaymentStatus() +
                '}';
    }

}
