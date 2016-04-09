package superkeyword;
/*
 * calling super class parameterized constructor from subclass.
 * 
 */
class onee1 {
	int i;

	onee1(int i) {
		this.i = i;
	}
}

class Twoo2 extends onee1 {
	int i;

	Twoo2(int a, int b) {
		super(a);
		i = b;
	}
void show(){
	System.out.println("subclass method ="+i);
	System.out.println("superclass method ="+super.i);
}
}

public class Super4 {

	public static void main(String[] args) {
		
		Twoo2 t=new Twoo2(11, 22);
		t.show();

	}

}
