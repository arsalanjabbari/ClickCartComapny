import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Category {
    static Scanner scanner = new Scanner(System.in);
    protected static List<Category> categoryDatabase = new ArrayList<>();

    // Populate categoryDatabase with five test records
    static {
        categoryDatabase.add(new Category("Electronics"));
        categoryDatabase.add(new Category("Appliances"));
        categoryDatabase.add(new Category("Clothing"));
        categoryDatabase.add(new Category("Books"));
        categoryDatabase.add(new Category("Furniture"));
    }

    private static int nextCategoryId = 1;

    private final int categoryId;
    private String name;

    public Category(String name) {
        this.categoryId = nextCategoryId++;
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to add a new category
    public static void addCategory(String name) {
        Category newCategory = new Category(name);
        categoryDatabase.add(newCategory);
        System.out.println("Category added: " + newCategory);
    }

    // Method to edit an existing category
    public static void editCategory(Category category, String name) {
        category.setName(name);
        System.out.println("Product edited: " + category);
    }

    // Method to delete an existing category
    public static void deleteCategory(Category category) {
        categoryDatabase.remove(category);
        System.out.println("Category deleted: " + category);
    }

    // Method to select a category
    public static void selectCategory(Customer customer, Category category) {

        System.out.println("Products in Category: " + category.getName());
        List<ProductDescription> productsInCategory = getProductsInCategory(category);


        if (!productsInCategory.isEmpty()) {
            for (int i = 0; i < productsInCategory.size(); i++) {
                System.out.println((i + 1) + ". " + productsInCategory.get(i).getName());
            }

            System.out.print("Enter the number of the product to select: ");
            int selectedProductIndex = scanner.nextInt();

            // Validate the selected index
            if (selectedProductIndex >= 1 && selectedProductIndex <= productsInCategory.size()) {
                ProductDescription selectedProduct = productsInCategory.get(selectedProductIndex - 1);
                ProductDescription.selectProduct(customer, selectedProduct);
            } else {
                System.out.println("Invalid selection. Please enter a valid number.");
            }
        } else {
            System.out.println("No products found in the selected category.");
        }

        scanner.close();
    }


    public static List<ProductDescription> getProductsInCategory(Category category) {
        return ProductDescription.productDatabase.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }

}
