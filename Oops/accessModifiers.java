
package Opps;
class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

public class accessModifiers {
   //public-private-protected -default {DATA HIDING CONCEPT}
   //public: info can be accessed in different packages or in the same class 
   //protected: accessed by ohter packages sub-classes and in current package it can be used anywhere
   //private: cant be accessed in self package and it needs getters and setters to access private access modifiers (getters: get the value of that private property, setters: set the value of that private property)

    
    public static void main(String[] args){
      Account ac1 = new Account();
      ac1.name ="Tada";
      ac1.email ="tada@gmail.com";
      ac1.setPassword("TadaLKakehashi");
      System.out.println(ac1.name);
      System.out.println(ac1.email);
      System.out.println(ac1.getPassword());
    }
}
