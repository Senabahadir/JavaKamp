package inheritance;

public class CustomerManager {
	public void add(Customer customer) {  //polimorhizim  = Customer onu extend eden sınıfların referanslarını tutabilir
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	

	//bulk insert
	public void addMultiple(Customer[] customers) {
}
