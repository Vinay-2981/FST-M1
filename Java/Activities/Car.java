package Javatrainings;

public class Car {
	
	String color;
	int make;
	String transmission;
    int tyres;
    int doors;
    
    Car () {
    	tyres = 4;
    	doors = 4;
		}

	public void displayCharacteristics() {
		// TODO Auto-generated method stub
		System.out.println("Colour of the Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of the Car: " + transmission);
		System.out.println("No of doors on the car: " + doors);
	    System.out.println("No of tyres on the car: " + tyres);
	}

	public void accelarate() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving forward.");
	}

	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car has stopped.");
		
	}	
		
	}



