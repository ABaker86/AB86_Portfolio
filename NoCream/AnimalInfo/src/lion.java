//extending Animal class as example of inheritance 
//the overridden methods are examples of poymorphism
public class lion extends Animal{

	/**
	 * The lion's overridden displayInfo method.
	 * @ return: returns a string
	 * */
	String location = "plains";
	
	public String displayInfo() {
		super.displayInfo();
		return "The lion is the king of the Jungle. Lions\nlive in the "+location;
	}


}
