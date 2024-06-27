package Collections;

import java.util.HashMap;

public class MapImplementation {
    public static void main(String[] args) {
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



        HashMap<Integer,Customer> customerMap = new HashMap<>();
        customerMap.put(123,customer);
        customerMap.put(124,customer);
        customerMap.put(125,customer);
        customerMap.put(125,customer);

        System.out.println(customerMap);
        System.out.println(customerMap.get(123));

    }
}
