package Opps;

class Student{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("constructor called!");
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class constructors {
    public static void main(String[] args) {
        Student stu1 = new Student("Aryan",22);
        stu1.printInfo();

        Student s2 = new Student(stu1);
        s2.printInfo();
    }
}
