import java.util.Random;

public class Product {

    String serialNumber;

    public Product() {
        this.serialNumber = generateSerialNumber();
    }
    private static final Random random = new Random();

    public String getSerialNumber() {
        return serialNumber;
    }

    public String generateSerialNumber() {
        int randomNumber = random.nextInt(1000000); // You can adjust the range as needed
        return "SN-" + randomNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

