package Opps;

public class inheritance1 {
    static class Shape{
        String color;
        //Base Class: Parent Class
    }

    static class Triangle extends Shape{
        // Child Class
    }
    public static void main(String[] args){
      Triangle t1 = new Triangle();
      t1.color = "red";
      System.out.println(t1.color);
    }
}
