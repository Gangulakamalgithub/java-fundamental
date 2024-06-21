package oops;

public class ConstructerTest {
    public static void main(String[] args) {
        Customer customer;
        customer = new Customer();
        System.out.println(customer.id);

        /*Test test =  new Test();
        test.test();*/
        Customer customer2 = new Customer(1234,"vijay","vijay@gmail.com","253672894", 500000, (byte) 30);
        customer2.customerDetails();
        //System.out.println(customer2.vendorName); not recommended
        System.out.println("Vendor : " + Customer.VENDOR_NAME);
        //customer2.vendorName = "Kamal EnterPrises PVT LTD";
        System.out.println("Vendor : " + Customer.VENDOR_NAME);
        Customer.displayVendorDetails();

    }
}
