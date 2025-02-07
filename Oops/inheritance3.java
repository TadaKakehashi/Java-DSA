package Opps;

class Car{
   int doors;
   int wheels;
   int speed;
}

class Buggati extends Car{
    String name;
}
class Rimac extends Buggati{
    String engine;
    Rimac(int doors, int wheels,int speed,String name){
       this.doors = doors;
       this.wheels = wheels;
       this.speed = speed;
       this.name = name; 
    }

    void printInfo(){
        System.out.println("The name of the Rimac model: "+name);
        System.out.println("The number of doors & wheels: "+doors+" "+wheels+" & "+speed);
        System.out.println("Top speed: "+speed+"kmph");
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Rimac rimac = new Rimac(4,4,355,"Concept Two");
        rimac.printInfo();
    }
}
