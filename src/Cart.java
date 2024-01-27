import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static int nextCartId = 1;
    private static CART_FILL cart_status;
    private final int id;
    private static List<ProductDescription> products;

    public Cart() {
        this.id = nextCartId++;
        products = new ArrayList<>();
        cart_status = CART_FILL.EMPTY;
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
    public void add2Cart(ProductDescription product) {
        products.add(product);
        cart_status = CART_FILL.NON_EMPTY;
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

    // Method to cancel the cart and remove all products
    public void cancelCart() {
        products.clear();
        cart_status = CART_FILL.EMPTY;
        System.out.println("Cart canceled.");
    }

    // Method to check if the cart is empty or not
    public static void checkCart() {
        if (cart_status == CART_FILL.EMPTY) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart is not empty. Products in cart: " + products.size());
        }
    }

    // Method to clear the cart (remove all products)
    public void clearCart() {
        products.clear();
        cart_status = CART_FILL.EMPTY;
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

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", products=" + products +
                ", cart_status=" + cart_status +
                '}';
    }

}
