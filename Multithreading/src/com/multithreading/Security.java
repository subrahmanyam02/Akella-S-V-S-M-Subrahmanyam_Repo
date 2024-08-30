package com.multithreading;
import com.multithreading.Account;
import com.multithreading.Customer;
import com.multithreading.UnAuthorizedWithdrawTransactionException;

public class Security {
public void authorization(Account account,Customer customer) throws UnAuthorizedWithdrawTransactionException{

	if(account.getCustomer().getCustomerId()!=customer.getCustomerId())
	throw new UnAuthorizedWithdrawTransactionException();
	}
	}
	

	
