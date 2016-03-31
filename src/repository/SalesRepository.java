package repository;

import java.util.List;

import Layout.Sales;

public final class SalesRepository extends AbstractRepository<Sales>{
	
private static final SalesRepository Instance= new SalesRepository();


private SalesRepository(){
	
}
public static SalesRepository getInstance(){
	return Instance;
}
public List<Sales>getSales(){
	return getData();
	
}


}
