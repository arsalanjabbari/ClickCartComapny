import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void manageCategory() {

        System.out.println("Manage Categories:");
        System.out.println("1. Add Category");
        System.out.println("2. Edit Category");
        System.out.println("3. Delete Category");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Category Details:");

                System.out.print("Category Name: ");
                String name = scanner.nextLine();

                scanner.nextLine(); // Consume the newline character

                Category.addCategory(name);
                break;
            case 2:
                System.out.print("Enter the id of the category to edit: ");
                int categoryIdToEdit = scanner.nextInt();

                Category categoryToEdit = findCategoryById(categoryIdToEdit);

                if (categoryToEdit != null) {
                    System.out.println("Enter Category's New Label:");

                    System.out.print("Category Label: ");
                    String ename = scanner.nextLine();

                    scanner.nextLine(); // Consume the newline character

                    Category.editCategory(categoryToEdit, ename);
                    System.out.println("Category edited successfully.");
                } else {
                    System.out.println("Category not found. Editing failed.");
                }
                break;
            case 3:
                System.out.print("Enter the id of the category to delete: ");
                int categoryIdToDelete = scanner.nextInt();

                Category categoryToDelete = findCategoryById(categoryIdToDelete);

                Category.deleteCategory(categoryToDelete);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void manageCustomer() {

        System.out.println("Manage Customers:");
        System.out.println("1. Add Customer");
        System.out.println("2. Edit Customer");
        System.out.println("3. Delete Customer");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Customer Details:");

                System.out.print("Customer Username: ");
                String username = scanner.nextLine();

                System.out.print("Customer Password: ");
                String password = scanner.nextLine();

                System.out.print("Customer Email: ");
                String email = scanner.nextLine();

                System.out.print("Customer Phone: ");
                String phone = scanner.nextLine();

                System.out.print("Customer Address: ");
                String address = scanner.nextLine();

                System.out.print("Customer Zipcode: ");
                String zipcode = scanner.nextLine();

                System.out.print("Customer Fullname: ");
                String fullname = scanner.nextLine();

                scanner.nextLine(); // Consume the newline character

                Customer.addCustomer(username, password, email, phone, address, zipcode, fullname);
                break;
            case 2:
                System.out.print("Enter the username of the customer to edit: ");
                String usernameToEdit = scanner.nextLine();

                Customer customerToEdit = findCustomerByName(usernameToEdit);

                if (customerToEdit != null) {
                    System.out.println("Enter Customer's New Details:");

                    System.out.print("Customer Password: ");
                    String epassword = scanner.nextLine();

                    System.out.print("Customer Email: ");
                    String eemail = scanner.nextLine();

                    System.out.print("Customer Phone: ");
                    String ephone = scanner.nextLine();

                    System.out.print("Customer Address: ");
                    String eaddress = scanner.nextLine();

                    System.out.print("Customer Zipcode: ");
                    String ezipcode = scanner.nextLine();

                    System.out.print("Customer Fullname: ");
                    String efullname = scanner.nextLine();

                    scanner.nextLine(); // Consume the newline character

                    Customer.editCustomer(customerToEdit, epassword, eemail, ephone, eaddress, ezipcode, efullname);
                    System.out.println("Customer edited successfully.");
                } else {
                    System.out.println("Customer not found. Editing failed.");
                }
                break;
            case 3:
                System.out.print("Enter the username of the customer to delete: ");
                String usernameToDelete = scanner.nextLine();

                Customer customerToDelete = findCustomerByName(usernameToDelete);

                Customer.deleteCustomer(customerToDelete);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void manageProduct() {

        System.out.println("Manage Products:");
        System.out.println("1. Add Product");
        System.out.println("2. Edit Product");
        System.out.println("3. Delete Product");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Product Details:");

                System.out.print("Product Name: ");
                String name = scanner.nextLine();

                System.out.print("Product Description: ");
                String description = scanner.nextLine();

                System.out.print("Product Price: ");
                double price = scanner.nextDouble();

                System.out.print("Product Availability: ");
                int availabilityy = scanner.nextInt();
                boolean availability;
                availability = availabilityy != 0;

                scanner.nextLine(); // Consume the newline character

                Category categoryy = assignCategory();
                ProductDescription.addProduct(name, description, price, availability, categoryy);
                break;
            case 2:
                System.out.print("Enter the name of the product to edit: ");
                String productNameToEdit = scanner.nextLine();

                ProductDescription productToEdit = findProductByName(productNameToEdit);

                if (productToEdit != null) {
                    System.out.println("Enter Product's New Details:");

                    System.out.print("Product Description: ");
                    String edescription = scanner.nextLine();

                    System.out.print("Product Price: ");
                    double eprice = scanner.nextDouble();

                    System.out.print("Product Availability: ");
                    int eavailabilityy = scanner.nextInt();
                    boolean eavailability = eavailabilityy != 0;

                    scanner.nextLine(); // Consume the newline character

                    Category ecategoryy = assignCategory(); // Implement assignCategory() method to get the category

                    ProductDescription.editProduct(productToEdit, edescription, eprice, eavailability, ecategoryy);
                    System.out.println("Product edited successfully.");
                } else {
                    System.out.println("Product not found. Editing failed.");
                }
                break;
            case 3:
                System.out.print("Enter the name of the product to delete: ");
                String productNameToDelete = scanner.nextLine();

                ProductDescription productToDelete = findProductByName(productNameToDelete);

                ProductDescription.deleteProduct(productToDelete);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static ProductDescription findProductByName(String productName) {
        for (ProductDescription product : ProductDescription.productDatabase) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Product not found
    }

    public static Customer findCustomerByName(String username) {
        for (Customer customer : User.customerDatabase) {
            if (customer.getUsername().equalsIgnoreCase(username)) {
                return customer;
            }
        }
        return null; // Product not found
    }

    public static Category findCategoryById(int id) {
        for (Category category : Category.categoryDatabase) {
            if (category.getCategoryId() == (id)) {
                return category;
            }
        }
        return null; // Product not found
    }

    private static Category assignCategory(){
        System.out.println("Available Categories:");

        // Assuming you have a List of categories, replace 'Category' with your actual class/type
        for (Category category : Category.categoryDatabase) {
            System.out.println(category.getName());
        }

        System.out.print("Enter the name of the category to assign: ");
        String selectedCategory = scanner.nextLine();

        for (Category category : Category.categoryDatabase) {
            if (category.getName().equals(selectedCategory))
                return category;
        }
        return null;
    }

    static void browseCategory(User user) {

        System.out.println("Available Categories:");

        // Assuming you have a List of categories, replace 'Category' with your actual class/type
        for (Category category : Category.categoryDatabase) {
            System.out.println(category.getName());
        }

        System.out.print("Enter the name of the category to browse: ");
        String categoryNameToBrowse = scanner.nextLine();
        Category browsingCat;
        for (Category category : Category.categoryDatabase) {
            if (categoryNameToBrowse.equalsIgnoreCase(category.getName())) {
                browsingCat = category;
                SelectedCategoryProducts((Customer) user, browsingCat);
                break;
            }
        }
    }

    private static void SelectedCategoryProducts(Customer customer, Category selectedCategory) {
        System.out.println("Browsing products in category: " + selectedCategory);
        Category.selectCategory(customer, selectedCategory);
    }

    static void searchProduct(Customer customer) {

        System.out.print("Enter the product name to search: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        List<ProductDescription> matchingProducts = new ArrayList<>();

        for (ProductDescription product : ProductDescription.productDatabase) {
            if (product.getName().toLowerCase().contains(searchTerm) && !matchingProducts.contains(product)) {
                matchingProducts.add(product);
            }
        }

        if (!matchingProducts.isEmpty()) {
            System.out.println("Matching products found:");
            for (int i = 0; i < matchingProducts.size(); i++) {
                System.out.println((i + 1) + ". " + matchingProducts.get(i));
            }

            // Prompt user to select a product
            System.out.print("Enter the number of the product to select: ");
            int selectedProductIndex = scanner.nextInt();
            scanner.nextLine();

            if (selectedProductIndex >= 1 && selectedProductIndex <= matchingProducts.size()) {
                ProductDescription.selectProduct(customer, matchingProducts.get(selectedProductIndex - 1));
            } else {
                System.out.println("Invalid selection. Returning to the main menu.");
            }
        } else {
            System.out.println("Product not found.");
            // Alternative Flow b.1.1
            System.out.println("Display the not-found message.");
        }
    }

    private static void confirmCart() {
        // Logic to confirm a shopping cart goes here
        System.out.println("Confirming shopping cart...");
    }

    public static Order convertCartToOrder(Customer customer, Cart cart) {
        // Assuming you have a method to calculate the total cost of the cart
        double totalCost = cart.calculatePrice();

        // Create OrderLines from the Cart's OrderLines
        List<OrderLine> orderLines = new ArrayList<>();
        for (OrderLine cartOrderLine : cart.getOrderLines()) {
            ProductDescription product = cartOrderLine.getProductDescription();
            int quantity = cartOrderLine.getQuantity();
            OrderLine orderLine = new OrderLine(product, quantity);
            orderLines.add(orderLine);
        }

        // Assuming you have a method to register the order in your system
        Order order = Order.registerOrder(customer, orderLines, totalCost);

        // Clear the customer's cart
        Cart.clearCart(customer);

        return order;

    }
}
