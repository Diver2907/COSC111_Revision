package OOPVehicles;

public class Vehicles {
	public String colour;
	public double price;
	public int year;
	
	public Vehicles() {colour="white";}
	public Vehicles(String colour, double price, int year) {
		this.colour=colour;
		this.price=price;
		this.year=year;
	}
	public String getColour() {return colour;}
	public void setColour(String colour) {this.colour=colour;}
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price=price;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year=year;}
}
