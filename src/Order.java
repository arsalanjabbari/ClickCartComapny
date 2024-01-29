import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {

    private static int nextOrderId = 1;

    private final int orderId;
    private final Customer customer;
    private final double totalPrice;
    private final Date date;
    private final String time;
    private final String description;
    private final List<OrderLine> orderedProducts;
    private DELIVERIES deliveryStatus;

    public Order(Customer customer, List<OrderLine> orderedProducts, double totalPrice, DELIVERIES deliveryStatus) {
        this.customer = customer;
        this.orderId = nextOrderId++;
        this.totalPrice = totalPrice;
        this.date = new Date();
        this.time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        this.description = "New Order";
        this.orderedProducts = orderedProducts;
        this.deliveryStatus = deliveryStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public List<OrderLine> getOrderedProducts() {
        return orderedProducts;
    }

    public DELIVERIES getDeliveryStatus() {return deliveryStatus;}

    public void setDeliveryStatus(DELIVERIES deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // Method to register an order with a list of products
    public static Order registerOrder(Customer customer, List<OrderLine> lines, double totalPrice) {
        Order order = new Order(customer, lines, totalPrice, DELIVERIES.INQUEUE);

        System.out.println("Order registered: " + order);

        return order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", orderedProducts=" + orderedProducts +
                '}';
    }

}
