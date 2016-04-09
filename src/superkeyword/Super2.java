package superkeyword;

class One1 {

	int i = 10;

	void show() {
		System.out.println(" super class method i=" + i);
	}

}

class Twoo extends One1 {
	int i = 20;

	void show() {
		System.out.println(" sub class method i=" + i);
		//super.show();
		//System.out.println("super class method i=" + super.i);
	}
}

public class Super2 {

	public static void main(String[] args) {
		Twoo t = new Twoo();
		t.show();
	}

}
