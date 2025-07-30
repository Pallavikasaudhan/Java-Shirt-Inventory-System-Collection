package ShirtProject;

public class Shirt {
	
	String brand;
	double price;
	String color;
	int size;
	Shirt(){
		
	}
	Shirt(String brand, double price, String color, int size){
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.size=size;
	}
	public String toString() {
	return "Brand is: "+brand+"\tPrice is: "+price+"\tColor is: "+color+"\tSize is: "+size;
	}

}
