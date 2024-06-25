package Futures;

public class Main1 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //customer.customerDetails();

         Customer customer1 = new Customer(1234,"vijay","vijay@gmail.com","253672894", 500000, (byte) 30);
         //customer1.customerDetails();

        RegularCustomer regularCustomer = new RegularCustomer(1234,"vijay","vijay@gmail.com","253672894", 500000, (byte) 30,700);
        //regularCustomer.CustomerDetails();


        PremiumCustomer premiumCustomer = new PremiumCustomer(1234,"Aijay","Ajay@gmail.com","998456673", 700000, (byte) 30,"Gold");
        //premiumCustomer.customerDetails();

        CustomerService customerService = new CustomerService();
        customerService.CustomerDetails(customer1);
    }
}
