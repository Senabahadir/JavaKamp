package inheritance;

public class Main {
	// iki adet s�n�f�m�z var. Baz� operasyonlar ortak bir yap�ya sahip. Ya onu iki kere ayr� ayr� s�n�flara yazar�z ya da inheritance mimarisinden yararlan�r�z.
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
