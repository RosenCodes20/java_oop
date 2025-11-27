import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Product productOne = new Product("TV Samsung", "Electronics", "Samsung", 400, 10);
        Product productTwo = new Product("Samsung Galaxy S10", "Electronics", "Samsung", 800, 40);

        ArrayList<Product> products = new ArrayList<>();
        products.add(productOne);
        products.add(productTwo);

        Store store = new Store(products);

        ArrayList<Product> filteredProducts = store.returnMatchedProductsByType("Electronics");
        if (filteredProducts.isEmpty()) {
            System.out.println("Nothing found here by this type :(");
        } else {
            for (Product product: filteredProducts) {
                System.out.println(product.productType);
            }
        }

        Product[] filteredProductsByProducer = store.returnMatchedProductsByProducerName("asf");
        int nullsCount = 0;
        for (Product filteredProduct: filteredProductsByProducer) {
            if (filteredProduct != null) {
                System.out.println(filteredProduct.productName + " " + filteredProduct.productProducer);
            } else {
                nullsCount++;
            }
        }

        if (nullsCount == filteredProductsByProducer.length) {
            System.out.println("Nothing found by this producer name :(");
        }

        ArrayList<Product> filteredProductsByPrice = store.returnProductsFromMinToMaxPrice(400, 800);

        if (filteredProductsByPrice.isEmpty()) {
            System.out.println("Nothing found from this price diapason");
        } else {
            for (Product product: filteredProductsByPrice) {
                System.out.println(product.productName + " " + product.productPrice);
            }
        }
    }
}