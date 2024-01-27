public class Delivery {

    private DELIVERIES deliveryStatus;

    public Delivery() {
        this.deliveryStatus = DELIVERIES.INQUEUE;
    }

    public DELIVERIES getDeliveryStatus() {
        return deliveryStatus;
    }

    // Method to register a new delivery
    public void registerDelivery() {
        if (deliveryStatus == DELIVERIES.INQUEUE) {
            System.out.println("Delivery registered.");
            deliveryStatus = DELIVERIES.ONWAY;
        } else {
            System.out.println("Cannot register delivery. Current delivery status is: " + deliveryStatus);
        }
    }

    // Method to update the delivery status
    public void updateDeliveries(DELIVERIES newStatus) {
        if (newStatus != null) {
            System.out.println("Delivery status updated to: " + newStatus);
            deliveryStatus = newStatus;
        } else {
            System.out.println("Invalid delivery status.");
        }
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryStatus=" + deliveryStatus +
                '}';
    }

}
