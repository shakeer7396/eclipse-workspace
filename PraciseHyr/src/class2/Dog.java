package class2;

public class Dog {
	public String breed = "German Shepard"; // Variables are storing the data or information with data types
	public int height = 30;
	public int weight = 35;

//	public static void main(String[] args) { // method are used for execution the logic
//		System.out.println("Test");
//	}
	public static void main(String[] args) {
		Dog pet = new Dog();				//variables are access only with the help of objects with constructors
		System.out.println(pet.breed);
	}
}
