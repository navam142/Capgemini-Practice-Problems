package generics.dynamiconlinemarketplace;

import java.util.*;

public class Catalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showAllProducts() {
        for (Product<?> p : products) {
            System.out.println(p);
        }
    }
}
