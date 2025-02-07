package Opps;

class MathOperations {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        
        System.out.println("Sum of 2 numbers: " + obj.add(5, 10));   // Calls add(int, int)
        System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15)); // Calls add(int, int, int)
    }
}
