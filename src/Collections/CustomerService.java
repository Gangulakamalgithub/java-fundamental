package Collections;

public class CustomerService {


    void displayCustomerDetails(Customer customer){
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }

}
