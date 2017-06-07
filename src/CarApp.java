
public class CarApp {

	public static void main(String[] args) {
	
	/*	
		Vehicle a = new Vehicle(565, "green", "altima", true);  
		System.out.println(a.Accelerating()); 
		
		
		Vehicle b = new Vehicle(40, "black", "chevy", false); 
		System.out.println(b.Accelerating()); 
		
		
		if(b.getemmission() == false && a.getemmission() == true){
			System.out.println("the " + a.getColor() +" " + a.gettype() + " just passed the " + b.getColor() + " " + b.gettype());
		}else if (a.getemmission() == false && b.getemmission() == true){
			System.out.println("the " + b.getColor() + " "+ b.gettype() + "just passes the " +a.getColor());	 
		}

		System.out.println("the " + a.getColor()+ " has just stopped."); 
		System.out.println("the " + b.getColor() + " has just stopped.");
		
		*/
		Driver d = new Driver(); 
		d.setPersonname("Daylin");
		System.out.println(d.operator()); 
		System.out.println(d.getPersonname() + " is the driver");
		
		Car c = new Car(565, "green", "altima", true); 
		c.setDriver(d);
		System.out.println(c.Accelerating()); 
		System.out.println(c.getDriver()); 
		System.out.println(c.Stop());
		

		
		
		
	
	}


}
