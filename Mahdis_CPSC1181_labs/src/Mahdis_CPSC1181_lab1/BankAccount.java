package Mahdis_CPSC1181_lab1;

import java.util.Random;
public class BankAccount {
	
	Random random = new Random();
	private String name;
	private int id;
	private String [] accountType = {"chequing","savings","TFSA"};
	private double amount ;
	private final double INTEREST_SAVINGS_YEARLY = 0.021;
	private final double INTEREST_TFSA_YEARLY = 0.023;
	private String chooseAccount;
	private double balance;
	private double interest;
	
	
	
	// we didnt need setters for id 
	
	
	public BankAccount() {
		id= random.nextInt(1000)+1;
		
	}
	
	
	// constructor with 2 parameters 
	
	public BankAccount(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public BankAccount(Random random, String name, String[] accountType, double amount) {
		this.random = random;
		this.name = name;
		id = random.nextInt(1000)+1;
		this.accountType = accountType;
		this.amount = amount;
	}

	

	public BankAccount(String name, int id, String[] accountType, double amount, String chooseAccount) {
		this.name = name;
		id = random.nextInt(1000)+1;
		this.accountType = accountType;
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

	public String[] getAccountType() {
		return accountType;
	}

	public void setAccountType(String[] accountType) {
		this.accountType = accountType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getChooseAccount() {
		return chooseAccount;
	}

	public void setChooseAccount(int type) {
		this.chooseAccount = accountType[type];
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
	 
		 if (this.chooseAccount=="savings") {
			 interest = this.balance*INTEREST_SAVINGS_YEARLY;
			 
		 }
		 
		 else if (this.chooseAccount=="TFSA") {
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
		System.out.println("Account Id: "+ id+" Name : "+ name+ " AccountType "+ accountType+ "amount  "+ amount);
	}
	
}
