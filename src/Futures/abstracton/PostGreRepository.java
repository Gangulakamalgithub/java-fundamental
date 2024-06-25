package Futures.abstracton;

public class PostGreRepository extends Repository{


    @Override
    void ConnectToDB() {
        System.out.println("Connection to PostGreDB is Successfully");
    }

    @Override
    void addCustomerToDB(Customer customer) {
        System.out.println("Customer data added to PostGreDB Database is Successfully");

    }
}
