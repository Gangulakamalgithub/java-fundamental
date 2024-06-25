package Futures.abstracton;

public class CustomerServiceimpl extends CustomerService{

    Repository repository;

    public CustomerServiceimpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addToCustomerDB(Customer customer) {
        repository.ConnectToDB();
        repository.addCustomerToDB(customer);

    }


}
