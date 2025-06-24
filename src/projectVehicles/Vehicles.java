package projectVehicles;

public class Vehicles {
	int plateNumber;
	String color;
	String type;
	double price;
	Vehicles(int plateNumber, String color, String type, double price) {
		this.plateNumber = plateNumber;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	Vehicles(){
		
	}

	public void printdisplaylnf() {
		System.out.println("plateNumber" + plateNumber);
		System.out.println("color:" + color);
		System.out.println("type:" + type);
		System.out.println("price:" + price);

	}
}
