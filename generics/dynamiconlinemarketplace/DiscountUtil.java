package generics.dynamiconlinemarketplace;

public class DiscountUtil {
    public static <T> void applyDiscount(Product<T> product, Double percentage) {
        if (percentage <= 0 || percentage > 80) {
            throw new IllegalArgumentException("Invalid price");
        }

        double discountedPrice = product.getPrice() * (1 - percentage/100);
        product.setPrice(discountedPrice);
    }
}
