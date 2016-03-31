package Layout;

public class Salesman {
private String ID_SALESMAN="001",cpf,name,salary;


public Salesman(String iD_SALESMAN, String cpf, String name, String salary) {
	
	ID_SALESMAN = iD_SALESMAN;
	this.cpf = cpf;
	this.name = name;
	this.salary = salary;
}

public String getID_SALESMAN() {
	return ID_SALESMAN;
}
public void setID_SALESMAN(String iD_SALESMAN) {
	ID_SALESMAN = iD_SALESMAN;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Salesman:" + ID_SALESMAN +"\n"+ "cpf:" + cpf +"\n"+ "name:" + name+"\n" + "salary:" + salary+"\n";
}

}
