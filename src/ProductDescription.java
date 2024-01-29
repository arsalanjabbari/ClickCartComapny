import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDescription {
    static Scanner scanner = new Scanner(System.in);

    protected static List<ProductDescription> productDatabase = new ArrayList<>();
    static {
        productDatabase.add(new ProductDescription("Laptop", "Powerful laptop", 1299.99, true, getCategoryByName("Electronics")));
        productDatabase.add(new ProductDescription("Smartphone", "High-end smartphone", 799.99, true, getCategoryByName("Electronics")));
        productDatabase.add(new ProductDescription("Coffee Maker", "Automatic coffee maker", 69.99, true, getCategoryByName("Appliances")));
        productDatabase.add(new ProductDescription("Running Shoes", "Comfortable running shoes", 79.99, true, getCategoryByName("Clothing")));
        productDatabase.add(new ProductDescription("Book", "Best-selling book", 19.99, true, getCategoryByName("Books")));
    }

    private String name;
    private String description;
    private double price;
    private boolean availability;
    private Category category;
    private List<Product> products;
    private List<Comment> comments;

    public ProductDescription(String name, String description, double price, boolean availability, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.category = category;
        this.products = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            this.products.add(new Product());
        }
        this.comments = new ArrayList<>();
        productDatabase.add(this);
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

    public List<Comment> getComments() {
        return comments;
    }

    public int getAvailability() {
        return products.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setAvailability(int availability) {
        if (availability!=0) {
            this.availability = true;
            return;
        }
        this.availability = false;
    }

    // Method to add a new product
    public static void addProduct(String name, String description, double price, boolean availability, Category category) {
        ProductDescription newProduct = new ProductDescription(name, description, price, availability, category);
        productDatabase.add(newProduct);
        System.out.println("Product added: " + newProduct);
    }

    // Method to edit an existing product
    public static void editProduct(ProductDescription product, String description, double price, boolean availability, Category category) {
        product.setDescription(description);
        product.setPrice(price);
        product.availability = availability;
        product.setCategory(category);
        System.out.println("Product edited: " + product);
    }

    // Method to delete an existing product
    public static void deleteProduct(ProductDescription product) {
        productDatabase.remove(product);
        System.out.println("Product deleted: " + product);
    }

    // Method to select a product
    public static void selectProduct(Customer customer, ProductDescription selectedProduct) {

        // Display product details
        System.out.println(selectedProduct);

        boolean productPage = true;
        while (productPage) {
            // Prompt user for action
            System.out.println("Options:");
            System.out.println("1. Add to Cart");
            System.out.println("2. Write a Comment");
            System.out.println("3. Show Comments");
            System.out.println("4. Back");
            System.out.println("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Cart.add2Cart(customer, selectedProduct);
                    break;
                case 2:
                    System.out.print("Your comment content: ");
                    String commentContent = scanner.nextLine();
                    Comment.writeComment(commentContent, selectedProduct);
                    break;
                case 3:
                    showComments(selectedProduct);
                    break;
                case 4:
                    System.out.println("Going back...");
                    productPage = false;
                    break;
                default:
                    System.out.println("Invalid choice. Going back...");
            }
        }
    }

    private static void showComments(ProductDescription selectedProduct) {

        // Retrieve comments associated with the selected product
        List<Comment> comments = selectedProduct.getComments();

        // Display comments
        System.out.println("Comments for " + selectedProduct.getName() + ": ");
        for (int i = 0; i < comments.size(); i++) {
            Comment comment = comments.get(i);
            System.out.println((i + 1) + ". " + comment.getContent());
        }

        boolean commentsPage = true;
        while (commentsPage) {
            // Prompt user for action
            System.out.println("Options:");
            System.out.println("1. Reply to a Comment");
            System.out.println("2. Back");
            System.out.print("Enter your choice (1-2): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select one of comments to reply:");
                    List<Comment> ncomments = selectedProduct.getComments();
                    for (int i = 0; i < ncomments.size(); i++) {
                        System.out.println((i + 1) + ". " + ncomments.get(i).getContent());
                    }

                    System.out.print("Enter the number of the comment to reply: ");
                    int commentIndex = scanner.nextInt();

                    // Validate the selected index
                    if (commentIndex >= 1 && commentIndex <= ncomments.size()) {
                        Comment selectedComment = ncomments.get(commentIndex - 1);

                        // Read the comment content from the user
                        System.out.println("Your comment content: ");
                        scanner.nextLine();
                        String commentContent = scanner.nextLine(); // Use nextLine to consume the newline character

                        // Reply to the selected comment
                        Comment.replyComment(selectedProduct, selectedComment, commentContent);

                        System.out.println("Reply added successfully.");
                    } else {
                        System.out.println("Invalid selection. Please enter a valid number.");
                    }
                    break;

                case 2:
                    // User selected "Back," no action needed
                    System.out.println("Going back...");
                    commentsPage = false;
                    break;
                default:
                    System.out.println("Invalid choice. Going back...");
            }
        }
    }

    public void addComment(ProductDescription product, Comment comment) {
        product.comments.add(comment);
        System.out.println("Comment added to product description: " + comment);
    }

    private static Category getCategoryByName(String categoryName) {
        for (Category category : Category.categoryDatabase) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }
        return null; // Handle the case where the category is not found
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                ", category=" + category +
                ", products=" + products +
                ", comments=" + comments +
                '}';
    }

}
