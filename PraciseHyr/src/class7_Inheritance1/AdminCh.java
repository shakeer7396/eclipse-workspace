package class7_Inheritance1;
//Implementation of inheritance with classes

//public class AdminCh extends DeveloperFa,GuestGP{ // Multiple classes extending is not possible class level,

public class AdminCh extends DeveloperFa { //Doubles classes are working in class its multilevel inheritance
	//This class takes automatically with Grand parent class GuestGP and parent DeveloperFa 
//	public void read() {
//		System.out.println("Operation reading access");
//	}
//	public void write() {
//		System.out.println("Operation Writing access");
//	}
	//Adding or deleting the products/application
	public void manage() {
		//read();
		super.read();//use super key its gave importance of this method 
		write();//Access directly 
		System.out.println("Operation Manage access");
	}
	
	public void read() { //Method using same name so it takes present class first 
		System.out.println("Its a local method");
	}

}
