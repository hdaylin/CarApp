
public abstract class Vehicle { 
	private int speed; 
	private String color;  
    private Person driver;

	public Person getDriver() {
		return driver;
	}

	public void setDriver(Person driver) {
		this.driver = driver;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Vehicle(){

		
	}

	public String Accelerating(){
		return "The vehicles is now accelerating.";
	}

	public int getSpeed(){
		return speed; 
	}   
	
	public void fasterSpeed()
	{
		speed = speed +500; 
		System.out.println("You accellerated you are now going" + speed +"mph");
	}

	public String getColor(){
		return color;
	}
	
	public void setColor(String newcolor){
		color = "blue"; 
		System.out.println("the new color is" + color );
	}

	public String Stop(){
		return "The vehicle has now stopped"; 
	}

	


}
