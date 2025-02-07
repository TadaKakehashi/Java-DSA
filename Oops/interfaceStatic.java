package Opps;
//Interfaces: class like but have some properties, Interfaces dont have constructors, non implemented functions/methods cant be declared here.
//Interface dont use extends to access it, we use {implements}.
//all the properties are by default static, final, public
//{STATIC KEYWORD: they are common throughout the class }

class School{
    static String school; //common throughout for every object , same we can add static methods as well. Static stuff are kept in a single memory and arent changed frequently. 
}

interface Animal1{
    void walk1(); 
}

interface Carnivore{
    void ear1();
}

//Multiple inheritance!!!!! Two base class has one child only possible through interface 
class Horse1 implements Animal1, Carnivore{
    public void ear1(){
        System.out.println("EarR!");
    };
    public void walk1(){
        System.out.println("Walks");
    }
}

public class interfaceStatic {
    public static void main(String[] args){
        Horse1 h1 = new Horse1();
        h1.walk1();
        School.school = "DPS"; //Direclty accesssing as they arent a part of the object. {static}

        School s1 = new School();
        System.out.println(s1.school);
    }
}
