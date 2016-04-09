class Student1 extends Teacher {
	int marks;

	void setMarks(int marks) {
		this.marks = marks;
	}

	int getMarks() {
		return marks;
	}

}

public class Use {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setId(100);
		s.setName("shalu");
		s.setAddres("gkp");
		s.setMarks(950);

		System.out.println("Id=" + s.getId());
		System.out.println("Name=" + s.getName());
		System.out.println("Address=" + s.getAdress());
		System.out.println("Marks=" + s.marks);
	}

}
