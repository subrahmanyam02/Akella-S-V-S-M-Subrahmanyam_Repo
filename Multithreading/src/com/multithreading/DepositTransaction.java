package com.multithreading;

	public class DepositTransaction extends Thread {
	
		private double transactionId;
	
		private Account account;
		
		private double amount;
		
		private double customerId;

		public DepositTransaction(double transactionId,Account account,double customerId,double amount){
		this.transactionId=transactionId;
		this.account=account;
		this.customerId=customerId;
		this.amount=amount;
		}

		public void deposit(Account account,double amount){
		
			account.setBalance((account.getBalance()+amount));
		}
		
		public void run(){
	
		deposit(account, amount);
		
		System.out.println(transactionId+" transaction "+ "completed!!!"+customerId +" thank you for "+"depositing to the Account "+account.getAccountNo());
		}
		}



