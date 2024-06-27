package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListImplementation {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(123);
        customer.setName("kamal");
        customer.setEmail("kamal@gmail");


        Customer customer1 = new Customer();
        customer1.setId(124);
        customer1.setName("Ravi");
        customer1.setEmail("Ravi@gmail");


        Customer customer2 = new Customer();
        customer2.setId(125);
        customer2.setName("Raju");
        customer2.setEmail("Raju@gmail");

        Customer customer3 = new Customer();
        customer3.setId(125);
        customer3.setName("Raju");
        customer3.setEmail("Raju@gmail");




        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        System.out.println(customer3);
        System.out.println(customerList.size());
        System.out.println(customerList);

        Customer firstCustomer = customerList.get(0);
        System.out.println(firstCustomer);
        CustomerService customerService = new CustomerService();
        for(Customer customers : customerList){
            //System.out.println(customer);
            customerService.displayCustomerDetails(customer);
        }



    }
}
