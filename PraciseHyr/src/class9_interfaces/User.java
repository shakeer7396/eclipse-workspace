package class9_interfaces;

public class User {

	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		
		lenovo.copy();
		lenovo.paste();
		lenovo.cut();
		lenovo.capture();
		
		HP hp = new HP();
		hp.printing();
		
		//Above all are java 7 version What to do only but java 8 also do how to do
		//java 8 version updates
		
		lenovo.security();
		Laptop.audio();  //static method will use without creating the object and constructor use directly with class name

	}

	

}
