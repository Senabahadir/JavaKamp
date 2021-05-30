package inheritance;

public class Main {
	// iki adet sýnýfýmýz var. Bazý operasyonlar ortak bir yapýya sahip. Ya onu iki kere ayrý ayrý sýnýflara yazarýz ya da inheritance mimarisinden yararlanýrýz.
	public static void main(String[] args) {
	
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "7894";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin, abc, hepsiBurada};
		
		
		
		customerManager.addMultiple(customers);
	}

}
