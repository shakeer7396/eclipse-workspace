package class6;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi, What is your name ?");
		String name =  scanner.nextLine();
		System.out.printf("Hey %s, How are you ? \n ",name);
		String status = scanner.nextLine();
		System.out.println("How old are you");
		int age = scanner.nextInt();
		System.out.println("Thankyou for the information have a great day");
		scanner.close();
		
	}

}
