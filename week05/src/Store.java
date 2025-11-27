import java.util.ArrayList;

public class Store {
    public ArrayList<Product> products;

    public Store(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> returnMatchedProductsByType(String type) {
        ArrayList<Product> result = new ArrayList<>();

        for (Product product: this.products) {
            if (product.productType.equals(type)) {
                result.add(product);
            }
        }

        return result;
    }

    public Product[] returnMatchedProductsByProducerName(String producerName) {
        Product[] result = new Product[this.products.toArray().length];
        int counter = 0;
        for (Product product: this.products) {
            if (product.productProducer.equals(producerName)) {
                result[counter] = product;
            }

            counter++;
        }

        return result;
    }

    public ArrayList<Product> returnProductsFromMinToMaxPrice(double minPrice, double maxPrice) {
        ArrayList<Product> result = new ArrayList<>();

        for (Product product: this.products) {
            if (product.productPrice >= minPrice && product.productPrice <= maxPrice) {
                result.add(product);
            }
        }

        return result;
    }
}
