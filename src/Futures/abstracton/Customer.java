package Futures.abstracton;

public class Customer {
    int id;

    String name;

    String email;

    String contact;

    int salary;

    byte age;

    public Customer() {
        System.out.println("Customer() is calling...");

    }

    public Customer(int id, String name, String email, String contact, int salary, byte age) {
        System.out.println("Customer(int,String,String,String,int,byte) is calling...");
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.age = age;
    }

}
