package Layout;

import java.util.List;

public class Sales {
	
	private String idSales, sale;

	

	private List<Item> item;
	private String salesmanName;

	public Sales(String idSales, String sale, List<Item> item, String salesmanName) {
		this.idSales = idSales;
		this.sale = sale;
		this.item = item;
		this.salesmanName = salesmanName;
	}

	public String getIdSales() {
		return idSales;
	}

	public void setIdSales(String idSales) {
		this.idSales = idSales;
	}

	public String getSale() {
		return sale;
	}

	public void setSale(String sale) {
		this.sale = sale;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}
	public Double getTotalValue(){
		double totalValue=0;
		for (Item item: getItem()) {
			totalValue+=(item.getPrice()*item.getQuantity());	
		}
		return totalValue;
	}
	@Override
	public String toString() {
		return "Sale:" + idSales + "\n"+"Id sale:" + sale + "\n"+"Item List:" + item + "\n" +"Salesman Name:"+ salesmanName;				
	}
}
