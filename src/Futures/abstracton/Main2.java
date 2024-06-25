package Futures.abstracton;


import Futures.CustomerService;

public class Main2 {
    public static void main(String[] args) {

       Customer customer1 = new Customer(1234,"vijay","vijay@gmail.com","253672894", 500000, (byte) 30);
       /*CustomerService customerService = new CustomerService();
       customerService.addToCustomerDB(customer1);*/
        MySqlRepository repository = new MySqlRepository();
        PostGreRepository repository1 = new PostGreRepository();
        CustomerServiceimpl customerService = new CustomerServiceimpl(repository1);
        customerService.addToCustomerDB(customer1);

    }
}
