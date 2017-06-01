
public class Vehicle { 

	private int speed = 500; 
	private String color = "red";  
	private String type = "Porshe"; 
	private boolean emmission = true; 


	public Vehicle(){

		System.out.println("The red Porsche is starting");
	}
	
	public Vehicle(int sp, String cx, String xx, boolean e){ 
	
		speed = sp;
		color = cx; 
		type =xx;  
		emmission = e;
		
		System.out.println("The " + color +" " + type +" is starting");
		System.out.println("the " + color +" " + type +" is going "  + speed + " mph");  
		
		if(emmission== true){
			System.out.println("The " + type + " passed the emmission test."); 
			
		}else{
			System.out.println("The " + type + " stopped for an emmission test.");
		}
		

	}

	public String Accelerating(){
		return "The car is now accelerating.";
	}

	public int getSpeed(){
		return speed; 
	}   
	
	public boolean getemmission(){
		return emmission;
	} 
	
	public String gettype(){
		return type;
	}
	
	public void setSpeed(int newspeed)
	{
		speed = newspeed; 
		System.out.println(newspeed);
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
		return "The car has now stopped"; 
	}


}
