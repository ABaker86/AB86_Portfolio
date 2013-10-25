//extending Animal class as example of inheritance 
//the overridden methods are examples of poymorphism
/**
 * This class is the Animal class with the virtual DisplayInfo Method.
 * */
public class Animal {
	
	/**
	 * The displayInfo method that all animals share.
	 * @ return: returns a string
	 * */
	String locatoin;
	String food = "Fish and berries.";
	
	public String getFood(){
		return food;
	}
	 public String displayInfo(){
		 return "All animal classes are subclasses of Animal.";
	 }

}
