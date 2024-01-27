import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopSystem {
    static void manageCategory() {
        // Logic to manage categories goes here
        System.out.println("Managing categories...");
    }

    static void manageCustomer() {
        // Logic to manage customers goes here
        System.out.println("Managing customers...");
    }

    static void manageProduct() {
        // Logic to manage products goes here
        System.out.println("Managing products...");
    }

    static void browseCategory() {
        // Logic to browse categories goes here
        System.out.println("Browsing categories...");
    }


    static void searchProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product name to search: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        List<ProductDescription> matchingProducts = new ArrayList<>();

        for (ProductDescription product : ProductDescription.productDatabase) {
            if (product.getName().toLowerCase().contains(searchTerm)) {
                matchingProducts.add(product);
            }
        }

        if (!matchingProducts.isEmpty()) {
            System.out.println("Matching products found:");
            for (ProductDescription matchingProduct : matchingProducts) {
                System.out.println(matchingProduct);
            }

            // Example: Call the selectProduct method with the first matching product
            if (matchingProducts.size() == 1) {
                ProductDescription.selectProduct(matchingProducts.get(0));
            }
        } else {
            System.out.println("Product not found.");
            // Alternative Flow b.1.1
            System.out.println("Display the not-found message.");
        }

        scanner.close();
    }


    private static void confirmCart() {
        // Logic to confirm a shopping cart goes here
        System.out.println("Confirming shopping cart...");
    }
}
