package task02;

public class Pet {

	protected String name;
	protected int years;
	
	public Pet(){
		this.name = "";
		this.years = 0;
	}
	
	public Pet(String name, int years){
		this();
		
		setName(name);
		setYears(years);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public void greet(){
		System.out.println("Hello I am " +  this.name);
		System.out.println("I am " +  this.years + ". years old");
	}
}

