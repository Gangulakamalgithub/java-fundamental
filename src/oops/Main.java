package oops;

public class Main {
    public static void main(String[] args) {
        //Object
        Customer customer1 ;//reference variable
        int x;//normal variable
        x = 40;
        System.out.println(x);
        customer1 = new Customer();//new customer object will be store in heap
        customer1.customerDetails();

        customer1.id = 123;
        customer1.name = "Kamal";
        customer1.email = "ganulakamal@gmail.com";
        customer1.contact = "1234567799";
        customer1.salary = 30000;
        customer1.age = 50;
        customer1.customerDetails();

        System.out.println("Id :" + customer1.id);
        System.out.println("Name :" + customer1.name);
        System.out.println("Email :" + customer1.email);
        System.out.println("Contact :" + customer1.contact);
        System.out.println("Salary :" + customer1.salary);
        System.out.println("Age : " + customer1.age);

        Customer customer2;
        customer2 = new Customer();

        customer2.id = 124;
        customer2.name = "vamshi";
        customer2.email = "vamshi@gmail.com";
        customer2.contact = "2467788344";
        customer2.salary = 50000;
        customer2.age = 34;

        System.out.println("Id :" + customer2.id);
        System.out.println("Name :" + customer2.name);
        System.out.println("Email :" + customer2.email);
        System.out.println("Contact :" + customer2.contact);
        System.out.println("Salary :" + customer2.salary);
        System.out.println("age : " + customer2.age);

        customer1.displayProducts("Diamond");
        customer2.displayProducts("Silver");

        /*byte discountPercentage = customer1.discountPercentageByAge();
        System.out.println(customer1.name + "'s Discount Percentage " + discountPercentage);
        */
        System.out.println(customer1.name + "'s Discount Percentage " + customer1.discountPercentageByAge() );
        System.out.println(customer2.name + "'s Discount Percentage " + customer2.discountPercentageByAge() );


        System.out.println("Final Product Price For " + customer1.name + " is $ " + customer1.finaleProductPriceAfterDiscount(30000));
        System.out.println("Final Product Price For " + customer2.name + " is $ " + customer2.finaleProductPriceAfterDiscount(30000));







    }

}
