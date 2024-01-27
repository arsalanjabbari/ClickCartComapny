public class Product {

    String serialNumber;

    public Product() {
        this.serialNumber = generateSerialNumber();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String generateSerialNumber() {
        return "SN-" + System.currentTimeMillis(); // A simple serial number generator (you might want to implement a better one)
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber='" + serialNumber + '\'' +
                '}';
    }

}

