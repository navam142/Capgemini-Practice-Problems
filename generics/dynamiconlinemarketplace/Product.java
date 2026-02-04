package generics.dynamiconlinemarketplace;

enum BookCategory {
    FICTION, NON_FICTION, ACADEMIC
}

enum ClothCategory {
    MEN, WOMEN, KIDS
}

enum GadgetCategory {
    MOBILE, LAPTOP, ACCESSORY
}

public class Product<T> {
    Integer id;
    Double price;
    String name;
    T category;

    public Product(String name, Integer id, Double price, T category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
    }

    public Double getPrice() {
        return this.price;
    }

    public T getCategory() {
        return this.category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override 
    public String toString() {
        return name + " | Rs " + price + " | Category: " + category;
    }
}


