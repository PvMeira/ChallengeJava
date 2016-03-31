package Layout;

public class Customer {
	
	
private String ID_CUSTOMER="002",cnpj,name,area;

public Customer(String iD_CUSTOMER, String cnpj, String name, String area) {
	
	ID_CUSTOMER = iD_CUSTOMER;
	this.cnpj = cnpj;
	this.name = name;
	this.area = area;
}



public String getID_CUSTOMER() {
	return ID_CUSTOMER;
}

public void setID_CUSTOMER(String iD_CUSTOMER) {
	ID_CUSTOMER = iD_CUSTOMER;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}
@Override
public String toString() {
	return "Customer:" + ID_CUSTOMER + "\n" +"cnpj:" +cnpj + "\n"+"Salesman name:" + name + "\n"+"Area:" + area+"\n" ;
}

}