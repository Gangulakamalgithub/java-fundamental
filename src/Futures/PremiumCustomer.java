package Futures;

public class PremiumCustomer extends Customer{
    String membership;


    public PremiumCustomer() {

    }

    public PremiumCustomer(int id, String name, String email, String contact, int salary, byte age, String membership) {
        super(id, name, email, contact, salary, age);
        this.membership = membership;
    }

    @Override
    void customerDetails() {
        super.customerDetails();
        System.out.println("Membership : " + membership);
    }
}
