package generics.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addProduct(new Product<>("iPhone17", 01, 83000.0, GadgetCategory.MOBILE));
        catalog.addProduct(new Product<>("Hoodie", 1239, 1500.0, ClothCategory.MEN));
        catalog.addProduct(new Product<>("Power Rangers Mega Force", 1249, 300.0, BookCategory.FICTION));
        catalog.showAllProducts();
    }
}
