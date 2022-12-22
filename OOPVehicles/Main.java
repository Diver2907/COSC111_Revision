package OOPVehicles;

public class Main {
	public static void main(String[] args) {
		Cars car1 = new Cars("","",0,0, "", 0,"","");		
		car1.setBrand("Subaru");
		car1.setModel("WRX");
		car1.setYear(2003);
		car1.setDoors(4);
		car1.setColour("Blue");
		car1.setEngine("2.5L Turbocharged Flat 4");
		car1.setHorsepower(300);
		car1.setShape("Sedan");
		car1.setRaceClass("Rally");
		car1.setPrice(31120);
		
		System.out.println("\nA Car\n");
		System.out.println("Brand: "+car1.getBrand());
		System.out.println("Model: "+car1.getModel());
		System.out.println("Year: "+car1.getYear());
		System.out.println("Colour: "+car1.getColour());
		System.out.println("Doors: "+car1.getDoors());
		System.out.println("Engine: "+car1.getEngine());
		System.out.println("Horse Power: "+car1.getHorsepower());
		System.out.println("Body Style: "+car1.getShape());
		System.out.println("Race Class: "+car1.getRaceClass());
		System.out.println("Price: $"+car1.getPrice());
		
	}
}
