package oop1;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product();
		// set value
		/*
		product1.name = "Kahve Makinesi";
		product1.unitPrice = 6.999;
		product1.discount = 10;
		product1.unitsInStock = 5;
		product1.imageUrl = "kahvemakinesi.jpg";
		*/
		product1.setName("Kahve Makinesi");
		product1.setUnitPrice(6.999);
		product1.setDiscount(10);
		product1.setUnitsInStock(5);
		product1.setImageUrl("kahvemakinesi.jpg");
		// get
		//System.out.println(product1.name);

		Product product2 = new Product();
		// set value
		/*
		product2.name = "Kahve Makinesi1";
		product2.unitPrice = 5.999;
		product2.discount = 9;
		product2.unitsInStock = 4;
		product2.imageUrl = "kahvemakinesi1.jpg";
		*/
		product2.setName("Kahve Makinesi1");
		product2.setUnitPrice(5.999);
		product2.setDiscount(9);
		product2.setUnitsInStock(4);
		product2.setImageUrl("kahvemakinesi1.jpg");

		Product product3 = new Product();
		//set value
		/*
		product3.name = "Kahve Makinesi2";
		product3.unitPrice = 4.999;
		product3.discount = 8;
		product3.unitsInStock = 3;
		product3.imageUrl = "kahvemakinesi2.jpg";
		*/
		product3.setName("Kahve Makinesi2");
		product3.setUnitPrice(4.999);
		product3.setDiscount(8);
		product3.setUnitsInStock(3);
		product3.setImageUrl("kahvemakinesi2.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) //products dizisindekileri tek tek gez
		{
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDiscount());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getImageUrl());
			System.out.println('\n');
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setPhone("055231231234");
		individualCustomer.setFirstName("Ahmet");
		individualCustomer.setLastName("Gökdağ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("051231215124");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}
}
