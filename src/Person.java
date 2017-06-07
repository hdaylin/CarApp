
public abstract class Person { 
	
	private String personname; 
	
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	
	public Person() {
		
	}

	public String operator() {
		return "you created a new operator"; 
	} 
	
	
	
}

