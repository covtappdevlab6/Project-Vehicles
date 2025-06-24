package projectVehicles;

public class Car extends Vehicles {

	Car(int plateNumber, String color, String type, double price) {
		super(plateNumber, color, type, price);
	}

	Car(){
		super();
	}
	public void printplayRadio() {
		System.out.println("radio is playing");

	}

}
