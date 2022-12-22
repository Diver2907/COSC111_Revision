package OOPVehicles;

public class Cars extends Vehicles{
	private String brand;
	private String model;
	private int doors;
	private String engine;
	private int hrsprs;
	private String shape;
	private String raceClass;
	
	public Cars() {this("","",0,0, "", 0,"","");}
	
	public Cars(String brand, String model,int year, int doors, String engine, int hrsprs, String shape, String raceClass){
		setBrand(brand);
		setModel(model);
		setYear(year);
		setDoors(doors);
		setEngine(engine);
		setHorsepower(hrsprs);
		setShape(shape);
		setRaceClass(raceClass);
		setColour(colour);
		setPrice(price);
	}
	
	public void setBrand(String brand) {this.brand=brand;}
	public void setModel(String model) {this.model=model;}
	public void setDoors(int doors) {this.doors=doors;}
	public void setEngine(String engine) {this.engine=engine;}
	public void setHorsepower(int hrsprs) {this.hrsprs=hrsprs;}
	public void setShape(String shape) {this.shape=shape;}
	public void setRaceClass(String raceClass) {this.raceClass=raceClass;}

	public int getDoors() {return doors;}
	public String getEngine() {return engine;}
	public int getHorsepower() {return hrsprs;}
	public String getShape() {return shape;}
	public String getRaceClass() {return raceClass;}
	public String getBrand() {return brand;}
	public String getModel() {return model;}

}
