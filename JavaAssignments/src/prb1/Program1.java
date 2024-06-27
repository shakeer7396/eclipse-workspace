package prb1;
//Verify any given number is Even or Odd
//eg; Input:5
//	output:Given number is Odd
//	Input:4
//	output:Given number is Even
//	20

import java.util.Scanner;

public class Program1 {
	
	public static void main(String args[]) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number= scanner.nextInt();
//		System.out.println(number%2);
		if(number%2 == 0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
		
		scanner.close();
	}

}
