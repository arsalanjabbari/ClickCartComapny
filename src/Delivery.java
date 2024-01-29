public class Delivery {

    private DELIVERIES deliveryStatus;

    public Delivery() {
        this.deliveryStatus = DELIVERIES.INQUEUE;
    }

    public DELIVERIES getDeliveryStatus() {
        return deliveryStatus;
    }

    // Method to register a new delivery
    public static void registerDelivery(Order order) {
        if (order.getDeliveryStatus() == DELIVERIES.INQUEUE) {
            System.out.println("Delivery registered.");
            order.setDeliveryStatus(DELIVERIES.ONWAY);
        } else {
            System.out.println("Cannot register delivery. Current delivery status is: " + order.getDeliveryStatus());
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
