import java.util.ArrayList;
import java.util.List;

public class Category {

    private static final List<Category> categoryList = new ArrayList<>();

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
    public static Category addCategory(String name) {
        Category newCategory = new Category(name);
        // Add logic to store the new category, e.g., in a list or database
        categoryList.add(newCategory);
        System.out.println("Category added: " + newCategory);
        return newCategory;
    }

    // Method to edit an existing category
    public void editCategory(String newName) {
        this.name = newName;
        // Add logic to update the category, e.g., in a list or database

        System.out.println("Category edited: " + this);
    }

    // Method to delete an existing category
    public void deleteCategory() {
        // Add logic to delete the category, e.g., from a list or database
        categoryList.add(this);
        System.out.println("Category deleted: " + this);
    }

    // Method to select a category
    public void selectCategory() {
        // Add logic to select the category, e.g., for further operations
        System.out.println("Category selected: " + this);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }

}
