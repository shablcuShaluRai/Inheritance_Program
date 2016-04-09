package superkeyword;

import java.io.IOException;

public class Super1 {

	public static void main(String[] args) {
		// Two t = new Two();
		One t = new One();
		
		One t1 = new Two();
		/*
		 * superclass object name=new subclass name is valid in inheritance but
		 * 
		 * 
		 * subclass object name = new superclass name is not valid in
		 * inheritance . but it may be valid when it converted using typecast.
		 * 
		 * 
		 * 
		 */
		//t.show();
		t1.show();
	}

}
