package collectors;
import java.util.*;
import java.util.stream.*;
class Customer{
	private String name;
	private double amount;
	
	Customer(String name,double amount){
		this.name=name;
		this.amount=amount;
	}
	public String getname() {
		return name;
	}
	public double getamount() {
		return amount;
	}
}
public class SumOrder {
  public static void main(String[]args) {
	  List<Customer>cust=Arrays.asList(
			  new Customer("sonam",123),
			  new Customer("sonam",234),
			  new Customer("bhumi",123),
			  new Customer("bhumi",123),
			  new Customer("anj",123));
	  
	  Map<String, Integer> totalPerCustomer =
			  cust.stream()
	                  .collect(Collectors.groupingBy(
	                      o -> o.getCustomer(),          // KEY: customer name
	                      Collectors.summingInt(o -> o.getAmount())  // VALUE: sum
	                  ));  }
}
