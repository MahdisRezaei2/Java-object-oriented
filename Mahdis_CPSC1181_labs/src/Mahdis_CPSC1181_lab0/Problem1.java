package Mahdis_CPSC1181_lab0;

import java.util.Scanner;
public class Problem1 {
          
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a string");
		String userInput = input.nextLine();
		int numberOfSpace =0;
		char space =' ';
		
		for (int i=0 ; i < userInput.length();i++) {
			char letter = userInput.charAt(i);
			if (letter == space) {
				numberOfSpace++;
			}
		}
		System.out.println("Number of spaces in the string is : "+ numberOfSpace);
		System.out.println("Total number of words in the string is : "+(numberOfSpace+1));
	}
}
