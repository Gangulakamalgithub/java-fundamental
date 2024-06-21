package oops;

public class Customer {
    //State
    //instance variable
    int id;

    String name;

    String email;

    String contact;

    int salary;

    byte age;

    final static String VENDOR_NAME = "Kamal Enterprises";

    final static String VENDOR_CONTACTNO = "123454679";


    //constructors
    //no-argument
    Customer(){
        System.out.println("Customer() is Calling ....");
        id = 1234;
        name = "Manoj";
        email = "manoj@gamil.com";
        contact = "124563789";
        salary = 400000;
        age = 29;
        configuration();

    }

    private void configuration() {
        System.out.println("Some Configuration After Creating On Object");
    }

    public Customer(int id, String name, String email, String contact, int salary, byte age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.age = age;
    }
    //behavior (methods)
    /*
    without return type without parameters
     */

    void customerDetails(){
        System.out.println("Id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Contact :" + contact);
        System.out.println("Salary :" + salary);
        System.out.println("age : " + age);
    }

    /*
    without return type with parameters
     */
    void displayProducts(String membershipType){
        System.out.println("Display Product on Membership: " + membershipType);
    }
    /*
    with return type without parameters
    */
    byte discountPercentageByAge(){
        System.out.println("DiscountPercentageByAge() is called....");
        byte discountPercentage = 0;
        if(age >= 60)
            discountPercentage = 30;
        else if(age >= 50 && age < 60)
            discountPercentage = 20;
        else if (age >= 20 && age < 40)
            discountPercentage = 15;
        else
            discountPercentage = 5;

        return discountPercentage;

    }
    /*
    with return type with parameters
    finalPrice after discount
    1.product price (parameter)
    2.discount percentage
    3.calculate final price (product Price - product price * discountPercenatage / 100 )
    4.Return finel Price
     */
    double finaleProductPriceAfterDiscount(double ProductPrice){
        byte discountPercentage = discountPercentageByAge();
        return ProductPrice - (ProductPrice * discountPercentage) / 100;

    }
    static void displayVendorDetails(){
        System.out.println("Vendor Name: " + VENDOR_NAME);
        System.out.println("Vendor ContactNO: " + VENDOR_CONTACTNO);
    }




}
