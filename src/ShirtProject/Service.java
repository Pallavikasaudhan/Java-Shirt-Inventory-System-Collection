package ShirtProject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Service {
		List<Shirt> shirts=new ArrayList<>();
		
		//method to add shirt
		public void addShirt(Shirt s) {
			shirts.add(s);
	}
		
		//Qa Access All Shirts
		public void displayAllShirts() {
			for(Shirt s:shirts)
				System.out.println(s);
		}
		
		//Qb Access all shirts of Arrow brand
		public void displayShirtsOfArrowBrand() {
			for(Shirt s:shirts)
				if (s.brand.equalsIgnoreCase("Arrow")) {
		            System.out.println(s);
		        }
		}
		
		//Qc Access all shirts of blackberry and size 40
		public void displayAllShirtsAsPerBrandAndSize() {
			for (Shirt s : shirts) {
	            if (s.brand.equalsIgnoreCase("Blackberry") && s.size == 40) {
	                System.out.println(s);
	            }
	        }
		}
		
		//Qd Access all shirts of price <=2500
		public void displayShirtsWithPriceLessThanEqualTo2500() {
		    for (Shirt s : shirts) {
		        if (s.price <= 2500) {
		            System.out.println(s);
		        }
		    }
		}
		
		//Qe Access all shirts of size 40 and price>2000
		public void displayShirtsOfSize40AndPriceGreaterThan2000() {
		    for (Shirt s : shirts) {
		        if (s.size == 40 && s.price > 2000) {
		            System.out.println(s);
		        }
		    }
		}
		//Qf Sort all shirts on size low to high
		public void sortOnSizeLowToHigh() {
			Collections.sort(shirts, Comparator.comparingInt((Shirt s)->s.size));
			displayAllShirts();	 
		}
		//Qg Sort all shirts on size high to low && Sort all shirts on price low to high
		public void sortOnSizeHighToLow() {
			Collections.sort(shirts, Comparator.comparingInt((Shirt s)->s.size).thenComparingDouble((s)->s.price).reversed());           
			displayAllShirts();
		}
		//Qh Sort all shirts on price low to high
		public void sortShirtsByPriceLowToHigh() {
			Collections.sort(shirts, Comparator.comparingDouble((Shirt s)->s.price));
		    displayAllShirts(); 
		}
		
		//Qi. Sort all shirts on price high to low
		public void sortShirtsByPriceHighToLow() {
			Collections.sort(shirts, Comparator.comparingDouble((Shirt s)->s.price).reversed());
		    displayAllShirts(); 
		}
		
		//Qj Sort all shirts on brands on ascending order of alphabets
		public void sortBrandLowToHigh() {
			Collections.sort(shirts, Comparator.comparing((Shirt s)->s.brand));
			displayAllShirts(); 
		}
		
		//Qk Sort all shirts on brands on descending order of alphabets
		public void sortBrandHighToLow() {
			Collections.sort(shirts, Comparator.comparing((Shirt s)->s.brand).reversed());
			displayAllShirts(); 
		}
		
		//Ql. Sort all shirts on price low to high, if price is same then sort on size low to high
		public void sortShirtsByPriceThenSize() {
			Collections.sort(shirts, Comparator.comparingDouble((Shirt s)->s.price).thenComparingInt(s->s.size));
		    displayAllShirts();
		}
		
		//Qm Sort all shirts on price low to high, if price is same then sort on brand in ascending order of alphabets
		public void sortShirtsByPriceThenBrand() {
		    Collections.sort(shirts,Comparator.comparingDouble((Shirt s) -> s.price).thenComparing(s -> s.brand.toLowerCase()));
		    displayAllShirts();
		}
		
		//Qn Sort all shirts on brands on ascending order of alphabets, if brands are same then sort on price low to high
		public void sortShirtsByBrandThenPrice() {
            Collections.sort(shirts,Comparator.comparing((Shirt s) -> s.brand.toLowerCase()).thenComparingDouble(s -> s.price) );
		    displayAllShirts();
		}
		
		//Qo Sort all shirts on brands on descending order, if brands are same then sort on price high to low
		public void sortShirtsByBrandDescThenPriceDesc() {
			 Collections.sort(shirts,Comparator.comparing((Shirt s) -> s.brand.toLowerCase()).thenComparingDouble(s -> s.price).reversed());
		    displayAllShirts(); 
		}
		 
		//Qp List all the brands available
		public void getAllBrands() {
			Set<String> brands=new HashSet<>();
			for(Shirt s:shirts) {
				brands.add(s.brand);
			}
			System.out.println("All Brands are: \n"+brands);
		}
		
		//Qq List all the size available
		public void getAllSize() {
		    Set<Integer> sizes = new HashSet<>();
		    for (Shirt s : shirts) {
		        sizes.add(s.size);  
		    }
		    System.out.println("All sizes are:\n" + sizes);
		}
		
		//Qr. List all the colour available
		public void getAllColour() {
		    Set<String> colours = new HashSet<>();
		    for (Shirt s : shirts) {
		        colours.add(s.color);  // Use the correct variable name and type
		    }
		    System.out.println("All colours are:\n" + colours);
		}
		
		//Qs Count the number of shirts available for a particular brand as per user input
				public void countShirtsOnBrand() {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the brand: ");
					String brand=sc.nextLine();
					int count=0;
					for(Shirt s:shirts) {
						if(s.brand.equalsIgnoreCase(brand))
							count++;
					}
				System.out.println("Total Shirts of "+brand+" are "+count);
				}
				
		//Qt Count the number of shirts available for a particular colour
				public void countShirtsOnColor() {
				    Scanner sc = new Scanner(System.in);
				    System.out.println("Enter the colour: ");
				    String color = sc.nextLine();
				    int count = 0;

				    for (Shirt s : shirts) {
				        if (s.color.equalsIgnoreCase(color)) {
				            count++;
				        }
				    }

				    System.out.println("Total shirts of color " + color + " are: " + count);
				}
		//Qu. Count the number of shirts available for a particular size	
			
				public void countShirtsOnSize() {
				    Scanner sc = new Scanner(System.in);
				    System.out.print("Enter the size: ");
				    int size = sc.nextInt();
				    int count = 0;

				    for (Shirt s : shirts) {
				        if (s.size == size) {
				            count++;
				        }
				    }

				    System.out.println("Total shirts of size " + size + " are: " + count);
				}	
				
			//Qv Count the number of shirts available in each brand
				public void countShirtsOfEachBrand() {
					Map<String, Integer> m1=new HashMap<>();
					for(Shirt s:shirts) {
						int val=m1.getOrDefault(s.brand, 0);
						m1.put(s.brand, val+1);
					}
					System.out.println(m1);
					m1.forEach((k,v)->System.out.println(k+" is total : "+v));
				}
				
			//Qw.Count the number of shirts available in each size
				public void countShirtsOfEachSize() {
				    Map<Integer, Integer> sizeCount = new HashMap<>();

				    for (Shirt s : shirts) {
				        int count = sizeCount.getOrDefault(s.size, 0);
				        sizeCount.put(s.size, count + 1);
				    }
				    sizeCount.forEach((size, count) -> 
				        System.out.println("Size " + size + " => Total: " + count));
				}

				
	
}
