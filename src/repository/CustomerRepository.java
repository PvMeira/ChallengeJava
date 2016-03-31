package repository;

import java.util.List;

import Layout.Customer;

public final class CustomerRepository extends AbstractRepository<Customer>{

	private static final  CustomerRepository instance= new CustomerRepository();

	private  CustomerRepository () {
	
		
	}
	public static CustomerRepository getInstance(){
		return instance ;
	}
	
	
	public List<Customer>getCustomer(){
		return getData();
		
	}
}
