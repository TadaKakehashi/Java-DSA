package Opps;

class Person {
    private String name; // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        name = newName;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice"); // Setting value using setter
        System.out.println("Name: " + p.getName()); // Getting value using getter
    }
}
