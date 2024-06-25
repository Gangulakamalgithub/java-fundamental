package Futures.abstracton;

public class MySqlRepository extends Repository{

    @Override
    void ConnectToDB() {
        System.out.println("Connection to MYSQL is Successful");

    }

    @Override
    void addCustomerToDB(Customer customer) {
        System.out.println("Customer data added to MYSQL Database is successfully");

    }
}
