package Javatrainings;

public class Activity1 {
	
	private int make;
	private String color;
	private String transmission;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Glanza = new Car();
		Glanza.make = 2014;
		Glanza.color = "Black";
		Glanza.transmission = "Manual";
		
		Glanza.displayCharacteristics();
		Glanza.accelarate();
		Glanza.brake();
		
	}

}
