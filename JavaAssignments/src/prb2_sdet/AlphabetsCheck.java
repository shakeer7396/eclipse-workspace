package prb2_sdet;

public class AlphabetsCheck {

	public static void main(String[] args) {
		String s = "WeLLcomE To AutOMatioN";
		
		String smallLetters = "";
		String capitalLetters = "";
		int smallCount = 0;
		int capitalCount = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			//Chek if Character is small letter and count it
			if(c >='a' && c <= 'z') {
				smallLetters += c;
				smallCount++;
			}
			 //Chek if Character is capital letter and count it
			else if(c >='A' && c <= 'Z') {
					capitalLetters += c;
					capitalCount++;
				}
		}
		System.out.println("Original String: " + s);
        System.out.println("Small Letters: " + smallLetters + " (Count: " + smallCount + ")");
        System.out.println("Capital Letters: " + capitalLetters + " (Count: " + capitalCount + ")");
		

	}

}
