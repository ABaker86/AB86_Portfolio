//extending Animal class as example of inheritance 
//the overridden methods are examples of poymorphism
public class bear extends Animal {

	/**
	 * The bear's overridden displayInfo method.
	 * @ return: returns a string
	 * */
	String location = "Forrest";
	String look = "large";
	
	public String displayInfo() {
		super.displayInfo();
		//The getFood method is an example of encapsulation
		return "Bears oh My!Bears are "+look+" fury and\neat a lot. Bears live in the "+location+" and\neats "+getFood();
	}

}
