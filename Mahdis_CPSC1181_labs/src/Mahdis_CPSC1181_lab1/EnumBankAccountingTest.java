package Mahdis_CPSC1181_lab1;

import java.util.Scanner;
public class EnumBankAccountingTest {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		EnumBankAccount acc1 = new EnumBankAccount();
		
		acc1.deposit(1000.50);
		System.out.println("please enter your name");
		String name = input.next();
		System.out.println("please choose type of your account by choosing the numbers: 1.chequing 2.savings 3.TFSA");
		int type = input.nextInt();
		
		switch(type) {
		case 1: acc1.setChooseAccount(accountType.chequing);
           break;

        case 2: acc1.setChooseAccount(accountType.saving);
           break;

        case 3: acc1.setChooseAccount(accountType.TFSA);
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


