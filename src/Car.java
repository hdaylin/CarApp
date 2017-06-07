
public class Car extends Vehicle {

	private int speed; 
	private String color;  
	private String type; 
	private boolean emmission = true; 
	private Person driver; 

	public Car(){ 


	}

	public Car(int speed, String color, String type, boolean e){ 
		this.speed =speed; 
		this.color = color; 
		this.type = type; 
		this.emmission = e;

	}

	@Override
	public Person getDriver() {
		return driver;
	}

	@Override 
	public void setDriver(Person driver) {
		this.driver = driver;
	}	
	@Override
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEmmission() {
		return emmission;
	}
	public void setEmmission(boolean emmission) {
		this.emmission = emmission;
	}   

	@Override 
	public String Stop(){
		return "the car is has now stopped"; 
	}


}
