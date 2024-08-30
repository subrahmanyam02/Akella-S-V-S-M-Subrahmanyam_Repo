package com.multithreading;

public class UnAuthorizedWithdrawTransactionException extends Exception{

	private static final long serialVersionUID = 1L;

	public UnAuthorizedWithdrawTransactionException() {
		super("The user is unauthorized for the withdrawal");
		}
		}





