package Futures;

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

    void customerDetails() {
        System.out.println("Id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Contact :" + contact);
        System.out.println("Salary :" + salary);
        System.out.println("age : " + age);
    }
}
