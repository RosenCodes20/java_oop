public class Product {
    public String productName;
    public String productType;
    public String productProducer;
    public double productPrice;
    public int productsOfThisCount;

    public Product (String productName, String productType, String productProducer, double productPrice, int productsOfThisCount) {
        this.productName = productName;
        this.productType = productType;
        this.productProducer = productProducer;
        this.productPrice = productPrice;
        this.productsOfThisCount = productsOfThisCount;
    }
}
