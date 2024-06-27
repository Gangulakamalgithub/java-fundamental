package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetImplementation {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(123);
        customer.setName("kamal");
        customer.setEmail("kamal@gmail");
        System.out.println(customer);

        Customer customer1 = new Customer();
        customer1.setId(124);
        customer1.setName("Ravi");
        customer1.setEmail("Ravi@gmail");
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.setId(125);
        customer2.setName("Raju");
        customer2.setEmail("Raju@gmail");

        Customer customer3 = new Customer();
        customer3.setId(125);
        customer3.setName("Raju");
        customer3.setEmail("Raju@gmail");
        System.out.println(customer3);

        System.out.println("Id: " + customer.getId());

        HashSet<Customer> customerSet = new HashSet<>();
        customerSet.add(customer);
        customerSet.add(customer1);
        customerSet.add(customer2);
        System.out.println(customer3);
        System.out.println(customerSet);

        /*HashSet<String> hashset = new HashSet<>();
        //LinkedHashSet<String> hashset = new LinkedHashSet<>();
        TreeSet<String> set = new TreeSet<>();

        set.add("kamal");
        set.add("gangula");//wrapping converting Primitives to wrapping object
        set.add("kamalakar");
        set.add("kamal");
        System.out.println(set.size());
        System.out.println(set);
        for (String str : set) {
            System.out.println(str);
        }*/


    }
}
