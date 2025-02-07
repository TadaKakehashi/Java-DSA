package Opps;

public class inheritance2 {
    static class Pet{
        String name;
        int age;
    }

    static class Dog extends Pet{
        String legs; 
        Dog(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        void printInfo(){
            System.out.println("Dog name is: "+name);
            System.out.println("Dog age is: "+age);
        }

    }
    static class Cat extends Pet{
        String legs;
        Cat(String name, int age){
          this.name = name;
          this.age = age;
        }

        void printInfo(){
            System.out.println("Cat name is: "+name);
            System.out.println("Cat age is: "+age);
        }
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("Dogesh",4);
        dog1.legs = "Four";
        dog1.printInfo();

        Cat cat1 = new Cat("Kaiju",5);
        cat1.legs = "Four";
        cat1.printInfo();
    
    }
}
