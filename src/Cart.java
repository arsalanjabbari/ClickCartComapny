import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {

    static Scanner scanner = new Scanner(System.in);
    private static int nextCartId = 1;
    private CART_FILL cart_status;
    private final int id;
    protected static List<ProductDescription> products;
    private final List<OrderLine> orderLines;

    public Cart() {
        this.id = nextCartId++;
        products = new ArrayList<>();
        this.cart_status = CART_FILL.EMPTY;
        this.orderLines = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<ProductDescription> getProducts() {
        return products;
    }

    public CART_FILL getcart_status() {
        return cart_status;
    }

    // Method to add a product to the cart
    public static void add2Cart(Customer customer, ProductDescription product) {
        Cart cart = customer.getCart();
        products.add(product);
        OrderLine orderLine = new OrderLine(product, 1);
        cart.orderLines.add(orderLine);
        cart.cart_status = CART_FILL.NON_EMPTY;
        System.out.println("Product added to cart: " + product);
    }

    // Method to calculate the total price of products in the cart
    public double calculatePrice() {
        double totalPrice = 0.0;
        for (ProductDescription product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }


    // Method to check if the cart is empty or not
    public static void checkCart(Customer checkingUser) {
        for (Customer user : User.customerDatabase) {
            if (user.equals(checkingUser)) {
                Cart cart = checkingUser.getCart();
                if (cart.cart_status == CART_FILL.EMPTY) {
                    System.out.println("Cart is empty.");
                } else {
                    System.out.println("Cart is not empty. Products in cart: " + products.size());
                    System.out.println("Options:");
                    System.out.println("1. Pay Cart");
                    System.out.println("2. Cancel Cart");
                    System.out.println("3. Select and Decrement amount of product");
                    System.out.println("4. Select and Increment amount of product");

                    System.out.print("Enter your choice (1-4): ");
                    int choice = scanner.nextInt();

                    handleCartOption(checkingUser, choice);
                }
            }
        }
    }
    private static void handleCartOption(Customer user, int choice) {
        switch (choice) {
            case 1:
                // Logic to pay the cart
                Cart cart = user.getCart();

                if (cart.getcart_status() == CART_FILL.EMPTY) {
                    // Alternative Flow a.1
                    System.out.println("Cart is empty. Cannot proceed with payment.");
                } else {
                    // Calculate overall cost
                    double overallCost = cart.calculatePrice();
                    Payment payment = new Payment();


                    // Display overall cost and confirm the bill
                    System.out.println("Overall Cost: " + overallCost);
                    System.out.print("Confirm the bill? (yes/no): ");
                    String confirmBill = scanner.next().toLowerCase();

                    if (confirmBill.equals("yes")) {
                        // Payment system logic (placeholder)
                        boolean paymentSuccessful = Payment.paymentRequest(payment, overallCost);

                        if (paymentSuccessful) {
                            Order paidOrder = OnlineShopSystem.convertCartToOrder(user, cart);


                            // Display order details
                            System.out.println("Order registered successfully:");
                            System.out.println(paidOrder);

                            // Ask the delivery system for a paid order and display details (placeholder)
                            Delivery.registerDelivery(paidOrder);
                        } else {
                            // Alternative Flow d.1
                            System.out.println("Payment was not successful. Please try again.");
                        }
                    } else {
                        // Alternative Flow b.1
                        System.out.println("Customer did not confirm the bill. Redirecting to the cart page.");
                    }
                }
                break;
            case 2:
                Cart.clearCart(user);
                System.out.println("Cart canceled.");
                break;
            case 3:
                System.out.println(user.getCart());
                // Logic to select and decrement the amount of a product
                // Implement your logic here
                break;
            case 4:
                // Logic to select and increment the amount of a product
                // Implement your logic here
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid number.");
        }
    }

    // Method to clear the cart (remove all products)
    public static void clearCart(Customer customer) {
        customer.getCart().getProducts().clear();
        customer.getCart().cart_status = CART_FILL.EMPTY;
        System.out.println("Cart cleared.");
    }

    // Method to decrement the buy amount of a product in the cart
    public void decrementBuyAmount(ProductDescription product) {
        if (products.contains(product)) {
            products.remove(product);
            System.out.println("Buy amount decremented for product: " + product);
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    // Method to increment the buy amount of a product in the cart
    public void incrementBuyAmount(ProductDescription product) {
        products.add(product);
        cart_status = CART_FILL.NON_EMPTY;
        System.out.println("Buy amount incremented for product: " + product);
    }
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", products=" + products +
                ", cart_status=" + cart_status +
                '}';
    }

}
