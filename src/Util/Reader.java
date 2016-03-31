package Util;
import java.util.Scanner;

import Layout.Customer;
import Layout.Item;
import Layout.Sales;
import Layout.Salesman;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;


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
        	}
        	else if(id.equals("002")){
        		String idCustomer=id;
        		String cnpj= scanR.next();
        		String name= scanR.next();
        		String area=scanR.next();
        		Customer c=new Customer(idCustomer, cnpj, name, area);
        	}
        	else if(id.equals("003")){
        		String idSales=id;
        		String idSale=scanR.next();
        		String idQuantity=scanR.next();
        		String idPrice=scanR.next();
        		String SalesmanName=scanR.next();
        		
        		String []
    
        }
        }
        
   } catch (FileNotFoundException fnfe) {
      System.err.println("Erro na abertura do arquivo ");
   }
	}
}