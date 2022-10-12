
package Mahdis_CPSC1181_lab0;
import java.util.Scanner;
public class Problem2 {
  
	public static void main(String[] args) {
	
		
		int binaryInput;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("please enter a binary number");
			binaryInput = input.nextInt();
			
			int count=0;
			double decimal=0;
			while(binaryInput!=0 && binaryInput !=-1 ){
				int digits = binaryInput%10;
				 binaryInput = binaryInput/10;
				System.out.println(digits);
					decimal = decimal+ digits*(Math.pow(2, count));
				    count++;
			}
			
			System.out.println(decimal);
		}while(binaryInput!=-1);
		
		    	 
		     
		}
	
}
