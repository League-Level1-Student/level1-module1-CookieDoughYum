
public class Platypus {
	//Platypus class
	private String name;
	public static void main(String[] args) {
		 Platypus Bob=new Platypus();
		 Bob.name="Bob";
		 Bob.sayHi();
	}
	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
}