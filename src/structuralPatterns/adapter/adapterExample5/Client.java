package structuralPatterns.adapter.adapterExample5;

public class Client {
    public static void main(String[] args) {
        //Custom Cache
        CustomerRepository customerRepository= new CustomerRepository(new CustomCache());
        customerRepository.save();

        CustomerRepository customerRepoAdapter = new CustomerRepository(new CacheDecoratorAdapter());
        customerRepoAdapter.save();
    }
}
