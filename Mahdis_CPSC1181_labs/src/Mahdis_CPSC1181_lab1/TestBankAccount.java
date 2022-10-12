package Mahdis_CPSC1181_lab1;


import java.util.Scanner;
public class TestBankAccount {
        
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		BankAccount acc1 = new BankAccount();
		
		acc1.deposit(1000.50);
		System.out.println("please enter your name");
		String name = input.next();
		System.out.println("please choose type of your account by choosing the numbers: 1.chequing 2.savings 3.TFSA");
		int type = input.nextInt();
		
		switch(type) {
		case 1: acc1.setChooseAccount(0);
           break;

        case 2: acc1.setChooseAccount(1);
           break;

        case 3: acc1.setChooseAccount(2);
           break;

	}
		acc1.setName(name);
		
		System.out.println(acc1.toString());
		acc1.withdraw(100.00);
		System.out.println();
		System.out.println("After Withdrawal of 100.00 CAD");
		System.out.println(acc1.toString());
		acc1.deposit(100.00);
		System.out.println();
		System.out.println("After Deposit of 100.00 CAD");
		System.out.println(acc1.toString());
		
		
	}

}



