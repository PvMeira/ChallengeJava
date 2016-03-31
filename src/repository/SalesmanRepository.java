package repository;

import java.util.List;

import Layout.Salesman;

public class SalesmanRepository extends AbstractRepository<Salesman>{
	
private static final SalesmanRepository Instance= new SalesmanRepository();


private SalesmanRepository(){
	
}
public static SalesmanRepository getInstance(){
	return Instance;
}
public List<Salesman>getSalesman(){
	return getData();
	
}

public Salesman searchSalesmanByName(String SalesmanName){
	
	return getData().stream().filter(Salesman ->Salesman.getName().equalsIgnoreCase(SalesmanName)).findFirst().get();
	
}
public long salesmanQuantity(){
	return getData().stream().distinct().count();
}


}