package Layout;

import repository.CustomerRepository;
import repository.SalesRepository;
import repository.SalesmanRepository;

public class DataAnalysis {


public StringBuilder amountClientInFile(){
	StringBuilder bClient=new StringBuilder();
	return bClient.append("The amount of clients in the .dat file is : "+CustomerRepository.getInstance().getCustomer().size());
}

public StringBuilder amountSalesManInFile(){
	StringBuilder bSalesman=new StringBuilder();
	return bSalesman.append("\nThe amount of Salesman in the the .dat file is : "+SalesmanRepository.getInstance().getSalesman().size());
}

public StringBuilder idMostExpensiveSale(){
	StringBuilder idBuilder=new StringBuilder();
	 Sales sale = new Sales(null, null, null, null);
	 sale = SalesRepository.getInstance().getSales().stream().max((sale1, sale2) -> sale1.getTotalValue().compareTo(sale2.getTotalValue())).get();  
	 return idBuilder.append("\n ID most Expensive Sale:"+sale.getSale()+ "Total Value: "+sale.getTotalValue());		
}
public StringBuilder worstSalesmanEver(){
	StringBuilder b=new StringBuilder();
	Sales sale = new Sales(null, null, null, null);
	 sale = SalesRepository.getInstance().getSales().stream().min((sale1, sale2) -> sale1.getTotalValue().compareTo(sale2.getTotalValue())).get();  
	return b.append("\n Name of the Worst Salesman Ever:"+sale.getSalesmanName());
		
	
}

}
