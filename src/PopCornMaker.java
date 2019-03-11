import javax.swing.JOptionPane;

public class PopCornMaker {
public static void main(String[] args) {
	String typeFlavor=JOptionPane.showInputDialog("What flavor of popcorn would you like?");
	Popcorn p=new Popcorn("Butter");
	Microwave m=new Microwave();
	String CookingTime=JOptionPane.showInputDialog("How long would you like to cook the popcorn?");
	int cook=Integer.parseInt(CookingTime);
	m.setTime(cook);
	m.putInMicrowave(p);
	p.applyHeat();
	m.startMicrowave();
	p.eat();
	
}
}
