package class6;

public class ConditionalStatements {

	public static void main(String[] args) {
//		Single Conditions
		
//		int i = -10;
//		if(i<0) {
//			System.out.println("It is a negitive number");
//		}
//		else {
//			System.out.println("It is a positive number");
//		}
		
//		Nested conditions
		
		String examStatus = "Pass";
		if(examStatus == "Pass") {
			System.out.println("Please wait for further information");
			String round_1_Status = "Pass";//Fail
			if(round_1_Status == "Pass") {
				System.out.println("You have cleared round-1 prepare for next round");
				String round_2_Status = "Fail"; //Fail
				if(round_2_Status == "Pass") {
					System.out.println("You have cleared round-2 Hr will contact you");
				}
				else {
					System.out.println("You can go to home");
				}
			}
			else {
				System.out.println("You can go to home");
			}
		}
		
	}

}
