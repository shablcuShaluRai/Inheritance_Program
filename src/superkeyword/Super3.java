package superkeyword;
/*
 * calling super class default constructor from subclass. 
 * 
 */

class Onee {
	Onee() {
		System.out.println("one constructor");
	}
}

class Twoe extends Onee {
	Twoe() {
		System.out.println("Two constructor");
	}
}

public class Super3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Twoe t =new Twoe();
		/*
		 * A constructor called at the time object creation.
		 * 
		 * 
		 * A constructor called only once per object.
		 * 
		 * 
		 * A constructor called and  executed automatically.
		 */
		
		
		/*
		 * when subclass object  is created,first of all the super class  default constructor is  called then
		 * only the subclass constructor is called.
		 */
	}

}
