package com.multithreading;
import com.multithreading.Account;
import com.multithreading.Customer;
import com.multithreading.InsufficientBalanceException;
import com.multithreading.UnAuthorizedWithdrawTransactionException;
import com.multithreading.Security;
	
public class WithdrawTransaction extends Security implements Runnable{
	
	private int transactionId;
	private Account account;
	private Customer customer;
	private double amount;

	public WithdrawTransaction(int transactionId,Account account,Customer customer,double amount){
	this.transactionId=transactionId;
	this.account=account;
	this.customer=customer;
	this.amount=amount;
	}
	public WithdrawTransaction(int transactionId2, Account firstAccount, com.customerautomation.Customer secondCustomer,
			int amount2) {
		// TODO Auto-generated constructor stub
	}
	public double withdraw(Account account,double amount) throws InsufficientBalanceException{
		if(account.getBalance()>=amount){
	account.setBalance(account.getBalance()-amount);

	}
		else{
			throw new InsufficientBalanceException();
			}
			
 return account.getBalance();
	}
	public void run() {
			try{
			authorization(account, customer);
			double balance=withdraw(account, amount);
			System.out.println(transactionId+" transaction"+ "completed!!! and the balance amount is "+balance);
			}catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException)
			{
			
			System.out.println(transactionId+" transaction "+ "failed!!! and "+unAuthorizedWithdrawTransactionException.getMessage());
			}
			catch(InsufficientBalanceException insufficientBalanceException)
			{

		System.out.println(transactionId + " transaction "+"failed!!! and your account has insufficientbalance");

	}
	}
	

}


