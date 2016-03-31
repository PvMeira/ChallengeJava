package readerSample;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Layout.Customer;
import Layout.Item;
import Layout.Sales;
import Layout.Salesman;
import repository.CustomerRepository;
import repository.SalesRepository;
import repository.SalesmanRepository;

public class Reader {
	public static void main(String[] args) {
		
	
	try {
		String file=System.getProperty("user.home");
		FileReader reader = new FileReader(file +File.separator+"data"+File.separator+"in"+File.separator+"flat_file_name.dat"); 
		
        Scanner scanR = new Scanner(reader);
        
        scanR.useDelimiter("ç|\\n|\\r");
        
        while(scanR.hasNext()){
        	String id=scanR.next();
        	if(id.equals("001")){
        		String idSalesman=id;
        		String cpf= scanR.next();
        		String name= scanR.next();
        		String salary=scanR.next();
        		Salesman s=new Salesman(idSalesman, cpf, name, salary);
        		SalesmanRepository.getInstance().add(s);
        		
        		
        	}
        	else if(id.equals("002")){
        		String idCustomer=id;
        		String cnpj= scanR.next();
        		String name= scanR.next();
        		String area=scanR.next();
        		Customer c=new Customer(idCustomer, cnpj, name, area);
        		CustomerRepository.getInstance().add(c);
        		
        		
        	}
        	else if(id.equals("003")){
        		String idSales=id;
        		String idSale=scanR.next();
        		String listItem=scanR.next();
        		String SalesmanName=scanR.next();
        		
        		listItem=listItem.replace("[", " ").replace("]", " ");
        		String[]list=listItem.split(",");
        		List<Item>itemList=new ArrayList<>();
        		
        		for (String string : list) {
        			String[]item=string.split("-");
        			int quantityI=Integer.parseInt(item[1]);
        			double priceI=Double.parseDouble(item[2]);
        			Item itemNew=new Item(item[0],quantityI,priceI);
        			itemList.add(itemNew);
				}
        		Sales sale=new Sales (idSales, idSale, itemList, SalesmanName);
        		SalesRepository.getInstance().add(sale);
        	
        	
   	        
        }
        	
        }
        FileWriter file1=new FileWriter();
        file1.FileWriter();
  
        reader.close();  
        scanR.close();
        
   } catch (IOException e) {
		System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}
	}
}