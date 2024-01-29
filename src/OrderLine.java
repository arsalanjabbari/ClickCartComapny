public class OrderLine {

    private static int nextLineNumber = 1;

    private final int lineNumber;
    private final double lineTotalPrice;
    private final int quantity;
    private final ProductDescription productDescription;

    public OrderLine(ProductDescription productDescription, int quantity) {
        this.lineNumber = nextLineNumber++;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.lineTotalPrice = productDescription.getPrice() * quantity;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLineTotalPrice() {
        return lineTotalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "lineNumber=" + lineNumber +
                ", lineTotalPrice=" + lineTotalPrice +
                ", quantity=" + quantity +
                ", productDescription=" + productDescription +
                '}';
    }
}
