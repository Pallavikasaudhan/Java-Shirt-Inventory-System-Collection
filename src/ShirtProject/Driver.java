package ShirtProject;

public class Driver {
	
	public static void main(String[] args) {
		Service service=new Service();
		service.addShirt(new Shirt("Arrow", 1234.5, "Red", 40));
		service.addShirt(new Shirt("Black", 3234.5, "White", 42));
		service.addShirt(new Shirt("Arrow", 1234.5, "Red", 38));
		service.addShirt(new Shirt("LP", 3234.5, "Black", 40));
		 service.addShirt(new Shirt("Blackberry", 2999.0, "Blue", 40));
		
		//Qa
		service.displayAllShirts();
		System.out.println("======================");
		
		//Qb
		service.displayShirtsOfArrowBrand();
		System.out.println("======================");
		
		//Qc
		service.displayAllShirtsAsPerBrandAndSize();
		System.out.println("======================");
		
		//Qd
	
		service.displayShirtsWithPriceLessThanEqualTo2500();
		System.out.println("======================");
		
		//Qe
		service.displayShirtsOfSize40AndPriceGreaterThan2000();
		System.out.println("======================");
	
		//Qf
		service.sortOnSizeLowToHigh();
		System.out.println("=========================");
		//Qg
		service.sortOnSizeHighToLow();
		System.out.println("======================");
		
		//Qh
		service.sortShirtsByPriceLowToHigh();
		System.out.println("======================");
		
		//Qi
		service.sortShirtsByPriceHighToLow();
		System.out.println("======================");
		
		//Qj
		 service.sortBrandLowToHigh();
		System.out.println("======================");
		
		//Qk
		 service.sortBrandHighToLow();
		System.out.println("======================");
		
		//Qk
		 service.sortShirtsByPriceThenSize();
		System.out.println("======================");
		
		//Qm
		 service.sortShirtsByPriceThenBrand();
		System.out.println("======================");
		
		//Qn
		 service.sortShirtsByBrandThenPrice();
		System.out.println("======================");
		//Qo
		 service.sortShirtsByBrandDescThenPriceDesc();
		System.out.println("======================");
		//Qp
		service.getAllBrands();
		System.out.println("======================");
		//Qq
		service.getAllSize();
		System.out.println("======================");
		//Qr
		service.getAllColour();
		System.out.println("======================");
		//Qs
		service.countShirtsOnBrand();   
		System.out.println("==================");
		//Qt
		service.countShirtsOnColor();
		System.out.println("======================");
		//Qu
		service.countShirtsOnSize();
		System.out.println("======================");
		//Qv
		service.countShirtsOfEachBrand();
		System.out.println("==================");
		//Qw
		service.countShirtsOfEachSize();
		System.out.println("======================");
		
	}

}
