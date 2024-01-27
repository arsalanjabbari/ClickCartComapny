import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static int nextOrderId = 1;

    private final int orderId;
    private double totalPrice;
    private Date date;
    private String time;
    private String description;
    private List<OrderLine> orderedProducts;

    public Order() {
        this.orderId = nextOrderId++;
        this.totalPrice = 0.0;
        this.date = new Date();
        this.time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        this.description = "New Order";
        this.orderedProducts = new ArrayList<>();
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

    // Method to register an order with a list of products
    public void registerOrder(List<OrderLine> products) {
        if (products.isEmpty()) {
            System.out.println("Cannot register an empty order.");
            return;
        }

        this.orderedProducts.addAll(products);

        // Calculate total price based on the prices of ordered products
        this.totalPrice = products.stream().mapToDouble(OrderLine::getLineTotalPrice).sum();

        System.out.println("Order registered: " + this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", orderedProducts=" + orderedProducts +
                '}';
    }

}
