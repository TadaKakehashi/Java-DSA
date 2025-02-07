package Opps;
//Method Overloading
class Student1{
    int age;
    String name;

    public void printInfo(String name){
        System.out.println("This is function 1");
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println("This is function 2");
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println("This is function 3");
        System.out.println(name +" " + age);
    }


}

public class methodOverloading2 {
    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        stu1.printInfo("Aryan");
        stu1.printInfo("John", 19);
        stu1.printInfo(12);
    }
}
