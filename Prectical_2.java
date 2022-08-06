Importjava.util.*;
	import java.util.Date;
	class Account {
	    private static int count;
	    private String id;
	    private double balance;
	    private double annualInterestRate;
	    private Date dateCreated;
	

	    public String getId() {
	        return id;
	    }
	

	    public void setId(String id) {
	        this.id = id;
	    }
	

	    public double getBalance() {
	        return balance;
	    }
	

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	

	    public double getAnnualInterestRate() {
	        return annualInterestRate;
	    }
	

	    public void setAnnualInterestRate(double annualInterestRate) {
	        this.annualInterestRate = annualInterestRate;
	    }
	

	    public java.util.Date getDateCreated() {
	        return dateCreated;
	    }
	

	    public void setDateCreated(Date dateCreated) {
	        this.dateCreated = dateCreated;
	    }
	

	    public Account() {
	        count++;
	        if (count < 10) {
	            id = "AC00" + (count);
	        } else {
	            id = "AC0" + (count);
	        }
	        balance = 500;
	        annualInterestRate = 0.07;
	        dateCreated = new java.util.Date();
	    }
	

	    public Account(String id, double balance) {
	        this.id = id;
	        this.balance = balance;
	    }
	

	    public void withdraw(double money) {
	        balance -= money;
	        System.out.println(money + " Rs successfully withdrawn.");
	        System.out.println("Remaining Balance is : " + balance);
	    }
	    public double getMonthlyInterestRate() {
	        return annualInterestRate / 12;
	    }
	

	    public double getMonthlyInterest() {
	        return balance * getMonthlyInterestRate();
	    }
	

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + "Rs deposited to your account.");
	        System.out.println("Current Balance is : " + balance);
	    }
	    public void getAccountdetailes() {
	        System.out.println("id : " + getId());
	        System.out.println("Balance : " + getBalance());
	        System.out.println("annualInterestRate : " + getAnnualInterestRate());
	        System.out.println("Monthly interest is : " + getMonthlyInterest());
	        System.out.println("This account was created at :  " + getDateCreated());
	    }
	

	}
	class Prectical_2{
	    // overdraf limit.
	    public static void main(String[] args) {
	        Account a1 = new Account();
	        a1.getAccountdetailes();
	        a1.setId("AC001");
	        a1.setBalance(500);
	        a1.setAnnualInterestRate(0.07);
	        a1.withdraw(100);
	        a1.deposit(100);
	
	    }
	}
