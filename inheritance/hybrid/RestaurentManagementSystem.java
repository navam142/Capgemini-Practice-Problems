package inheritance.hybrid;

interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duty: Cooking " + specialization + " dishes in the kitchen.");
    }

    public void displayRole() {
        System.out.println("Role: Chef");
    }
}

class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duty: Serving customers at " + tableCount + " tables.");
    }

    public void displayRole() {
        System.out.println("Role: Waiter");
    }
}


public class RestaurentManagementSystem {
    public static void main(String[] args) {
        Chef c1 = new Chef("Rahul", 101, "Italian");
        Waiter w1 = new Waiter("Aman", 201, 6);

        c1.displayRole();
        c1.showInfo();
        c1.performDuties();

        System.out.println();

        w1.displayRole();
        w1.showInfo();
        w1.performDuties();
    }
}
