package prb1;

import java.util.Scanner;

//Assignment - contd
//3. Print the statement baed on day name
//	Monday to Friday -> Uff, Its a Weekday
//	Satday & Sunday -> Yayy, Its a Weekend

public class Program3 {
	
	public static void main(String args[]) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Please enter the day name");
		String dayName = scanner.next();
		if(dayName.equals("Monday")||
				dayName.equals("Tueday")||
				dayName.equals("Wedday")||
				dayName.equals("Thuday")||
				dayName.equals("Friday"))
			System.out.println("Uff its a weekday");
		else if(dayName.equals("Satday")||
				dayName.equals("Sunday"))
			System.out.println("Yayy its a Weekend");
		
		scanner.close();
	}

}
