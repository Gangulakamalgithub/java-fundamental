package Futures;

public class RegularCustomer extends Customer{
    int cashBackPoints;


    public RegularCustomer() {
        super();
        System.out.println("RegularCustomer() is calling...");
    }

    public RegularCustomer(int id, String name, String email, String contact, int salary, byte age, int cashBackPoints) {
        super(id, name, email, contact, salary, age);
        this.cashBackPoints = cashBackPoints;
    }

    void CustomerDetails(){
        super.customerDetails();
        System.out.println("Cash Back Points : " + cashBackPoints);

    }
}
