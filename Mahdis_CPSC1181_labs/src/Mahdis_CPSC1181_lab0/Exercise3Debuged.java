package Mahdis_CPSC1181_lab0;
public class Exercise3Debuged {
      
	public static void main(String[] args) {
		int value = 5;
		for (int num = 1; num <= value; num++) {
			for (int i = 1; i <= (value - num); i++) {
				System.out.print(" ");
			}
			
			for (int i = 1; i <= ((2 * num) - 1); i++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}




