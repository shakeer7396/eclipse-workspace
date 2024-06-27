package prb1;

import java.util.Scanner;

//2.Print the Student results based on the grading system
//<35-fail  == 35 -pass   35 to 70 -third class 70 to 85 -second class  >85 first class
//eg: Input: 75   Output: Student secured second class
//	Input: 25   Output: Student is failed

public class Program2 {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the student marks");
		int marks= scanner.nextInt();
//		System.out.println(marks);
		if(marks<35) 
			System.out.println("Student is Failed");
		else if(marks==35)
			System.out.println("Student is just Pass");
		else if(marks > 35 && marks < 70)
			System.out.println("Student secured Third Class");
		else if(marks >=70 && marks < 85)
			System.out.println("Student secured Second Class");
		else if(marks >= 85)
			System.out.println("Student secured First Class");
		
		scanner.close();
		
	}

}
