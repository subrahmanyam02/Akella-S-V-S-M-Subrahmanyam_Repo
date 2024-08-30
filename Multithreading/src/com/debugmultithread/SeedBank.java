package com.debugmultithread;
import com.debugmultithread.BankFund;
import com.debugmultithread.LoanTransaction;
public class SeedBank {


	public static void main(String[] args) {
	//Initializing the SeedBank fund
	BankFund seedBankFund=new BankFund(9000000);

	//creating an array of transactions
	LoanTransaction[] loanTransactions=new LoanTransaction[100];
	for(int index=0;index<loanTransactions.length;index++){
	loanTransactions[index]=new LoanTransaction(seedBankFund, (1000+index), 250000);
	}

	//requesting for the loan at different branches
	for(int index=0;index<loanTransactions.length;index++){
	try {
		loanTransactions[index].start();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
	}

