import java.util.ArrayList;
import java.util.List;

public class ProductDescription {

    private static final List<ProductDescription> productList = new ArrayList<>();

    private final String name;
    private String description;
    private double price;
    private boolean availability;
    private Category category;
    private final List<Product> products;

    public ProductDescription(String name, String description, double price, boolean availability, Category category, List<Product> products) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.products = new ArrayList<>();
        productList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public List<Product> getProducts() {
        return products;
    }


    // Method to get availability (number of products)
    public int getAvailability() {
        return products.size();
    }

    // Method to add a new product
    public static ProductDescription addProduct(String name, String description, double price, boolean availability, Category category, List<Product> products) {
        ProductDescription newProduct = new ProductDescription(name, description, price, availability, category, products);
        productList.add(newProduct);
        System.out.println("Product added: " + newProduct);
        return newProduct;
    }

    // Method to edit an existing product
    public void editProduct(String description, double price, boolean availability, Category category) {
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.category = category;
        System.out.println("Product edited: " + this);
    }

    // Method to delete an existing product
    public void deleteProduct() {
        productList.remove(this);
        System.out.println("Product deleted: " + this);
    }

    // Method to select a product
    public void selectProduct() {
        System.out.println("Product selected: " + this);
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                ", category=" + category +
                '}';
    }

}
