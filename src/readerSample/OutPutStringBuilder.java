package readerSample;

import Layout.DataAnalysis;

public class OutPutStringBuilder {
	
	DataAnalysis data=new DataAnalysis();
	
 public StringBuilder createFile(){
	 StringBuilder finalBuilder= new StringBuilder();
	 return finalBuilder.append(data.amountClientInFile()).append(data.amountSalesManInFile()).append(data.idMostExpensiveSale()).append(data.worstSalesmanEver());	
 }
 

}
