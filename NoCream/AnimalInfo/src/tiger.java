//extending Animal class as example of inheritance 
//the overridden methods are examples of poymorphism
public class tiger extends Animal{

	/**
	 * The tiger's overridden displayInfo method.
	 * @ return: returns a string
	 * */
	String location = "Jungle";
	String look = "stripes";
	
	public String displayInfo() {
		super.displayInfo();
		return "Tigers are similar to Lions but they have \n"+look+". Tigers live in the "+location;
	}

}
