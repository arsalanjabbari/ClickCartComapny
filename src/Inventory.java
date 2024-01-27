import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private final Map<String, Integer> availabilities; // Map product_id to availability

    public Inventory() {
        this.availabilities = new HashMap<>();
    }

    public Map<String, Integer> getAvailabilities() {
        return availabilities;
    }

    // Method to update product availabilities in the inventory
    public void updateAvailabilities(Map<String, Integer> availabilityUpdates) {
        for (Map.Entry<String, Integer> entry : availabilityUpdates.entrySet()) {
            String productId = entry.getKey();
            Integer newAvailability = entry.getValue();

            if (newAvailability != null && newAvailability >= 0) {
                availabilities.put(productId, newAvailability);
                System.out.println("Availability updated for product_id " + productId + ": " + newAvailability);
            } else {
                System.out.println("Invalid availability for product_id " + productId);
            }
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "availabilities=" + availabilities +
                '}';
    }

}