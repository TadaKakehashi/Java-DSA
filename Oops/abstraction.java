package Opps;
//Abstractions: Only show imp information to the user and hide the unnecessary information from the user
//Use abstract keyword(concept of blueprint which doesnt need to be used) or use interface class 
// Abstract class must be declared with an absrtact keyword, it can have abstract and non-abstract methods, it cant be instantiated, it can have constructors and static methods also.
abstract class Animal{
    abstract void walk(); //walk type of function which would be existing in other sub classes
    Animal(){
        System.out.println("Constructor called!");
    }
    public void eats(){
        System.out.println("animal eats");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on four legs");
    }
}
public class abstraction {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.walk();
    }
}
