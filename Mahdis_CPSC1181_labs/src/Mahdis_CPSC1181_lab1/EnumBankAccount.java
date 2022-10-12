package Mahdis_CPSC1181_lab1;

import java.util.Random;
enum accountType {chequing, saving, TFSA};
public class EnumBankAccount {
    
	
	Random random = new Random();
	private String name;
	private int id;
	private double amount ;
	private final double INTEREST_SAVINGS_YEARLY = 0.021;
	private final double INTEREST_TFSA_YEARLY = 0.023;
	private accountType chooseAccount;
	private double balance;
	private double interest;
	
	
	
	
	public EnumBankAccount() {
		id= random.nextInt(1000)+1;
		
	}
	
	
	// constructor with 2 parameters 
	
	public EnumBankAccount(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public EnumBankAccount(Random random, String name, accountType chooseAccount, double amount) {
		this.random = random;
		this.name = name;
		id = random.nextInt(1000)+1;
		this.chooseAccount = chooseAccount;
		this.amount = amount;
	}

	

	public EnumBankAccount(String name, int id,  double amount, accountType chooseAccount) {
		this.name = name;
		id = random.nextInt(1000)+1;
		this.amount = amount;
		this.chooseAccount = chooseAccount;
		this.balance=0.0;
	}

	// getters and setters methods
	


	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public accountType getChooseAccount() {
		return chooseAccount;
	}

	public void setChooseAccount(accountType chooseAccount) {
		this.chooseAccount = chooseAccount;
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getINTEREST_SAVINGS_YEARLY() {
		return INTEREST_SAVINGS_YEARLY;
	}

	public double getINTEREST_TFSA_YEARLY() {
		return INTEREST_TFSA_YEARLY;
	}
	
   // deposit method
public void deposit(double amount) {
	   
		   this.balance +=amount;
	   
   }
   public void withdraw(double amount) {
	   this.balance -=amount;
   }
   
 public double Yearly_Interest () {
         interest=0.0;
	 
		 if (this.chooseAccount.equals(accountType. saving)) {
			 interest = this.balance*INTEREST_SAVINGS_YEARLY;
			 
		 }
		 
		 else if (this.chooseAccount.equals(accountType. TFSA)) {
			 interest = this.balance*INTEREST_TFSA_YEARLY;
			 
		 }
		 return interest;
	 }
	
	 
 
 
 public String toString(){

		String result = "Name: "+this.getName()+"  ";
		result += "Account ID: "+this.getId()+"  ";
		result += "Account Type: "+this.getChooseAccount()+"  ";
		result += "Account Balance: "+ this.getBalance()+" CAD  ";
		result += "Interest Earned(Yearly): "+ this.Yearly_Interest()+" CAD";
	
		return result;
	}
 public void AccountDetails() {
		System.out.println("Account Id: "+ id+" Name : "+ name+ " AccountType "+ chooseAccount+ "amount  "+ amount);
	}
	
	
}
