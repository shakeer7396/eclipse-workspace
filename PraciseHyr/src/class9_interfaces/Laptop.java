package class9_interfaces;
//This is a just business document or set of rules and guidelines, another implementer also is called class so create other classes
//Every class is a business implementer
public interface Laptop {

	//Every rule is a one method in interface, Interface tells what to do.
	void copy(); //In interface you don't put public its not change default as like a class, its always public in interface

	public void paste();

	public void cut();

	public void keyboard();

	//static method will access in non static method, but non static method will not call in static method
	//java 8 provides 2 ways to implement code default and static, when use default it take permission with business owner means class, while update code
	default void security() { 
		commonCode();
		System.out.println("Laptop security code");
	}
	static void audio() { //This will use without creating the object and constructor, when use static it didn't take permission with owner while update code
		commonCode();
		System.out.println("Lenovo audio code");

	}

	//java 9 version updates 
	//private method used for avoiding the same name method calls in same instructor class

	private static void commonCode() {
		System.out.println("CommonCode");
	}
}
