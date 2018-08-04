package codingchallange;

import java.util.Scanner;

public class percentageOfLettersAndDigits {

	public static void main(String[] args) {
		String data = "Tiger Runs @ The Speed Of 100 km/hour";
		char [] charArray=data.toCharArray();
	
		int upperCase=0; int lowerCase=0; int digits=0; int others=0;
		int totalChars = data.length();
		for(int i=0; i<data.length(); i++) {
			if(Character.isUpperCase(charArray[i])) {
				upperCase++;
			}
			else if(Character.isLowerCase(charArray[i])){
				lowerCase++;
			}
			else if(Character.isDigit(charArray[i])) {
				digits++;
			}
			else {
				others++;
			}
		}
		System.out.println("Total Characters :" +totalChars);
		System.out.println("Number of uppercase letters: " +upperCase + "  so percentage is : " +(upperCase*100)/+totalChars + "%" );
		System.out.println("Number of lower letters: " +lowerCase + "  so percentage is : " +(lowerCase*100)/+totalChars + "%" );
		System.out.println("Number of digits: " +digits + "  so percentage is : " +(digits*100)/+totalChars + "%" );
		System.out.println("Number of other characters: " +others + "  so percentage is : " +(others*100)/+totalChars + "%" );

	}

}
