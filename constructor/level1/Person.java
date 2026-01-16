package constructor.level1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;  
        this.age = other.age;   
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        
        Person shivam = new Person("Shivam", 20);
        Person navam = new Person(shivam);
        navam.displayInfo();
        shivam.displayInfo();
    }
}
