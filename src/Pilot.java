
public class Pilot extends Person {

	String name;

	public Pilot(){

	}

	public Pilot(String name){	
		this.name = name;  

	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String operator(){
		return "The operator is a pilot"; 

	}  
	
	


} 



