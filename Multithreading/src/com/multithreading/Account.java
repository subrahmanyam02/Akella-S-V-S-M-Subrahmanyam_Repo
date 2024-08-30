package com.multithreading;

public class Account {
	private double accountNo;
	private Customer customer;
	protected double balance;
	public Account(double accountNo,Customer customer,double balance){
	this.accountNo=accountNo;
	this.balance=balance;
	this.customer=customer;
	 
	}

	public Account(){}
	public double getAccountNo() {
	return accountNo;
	}
	public void setAccountNo(double accountNo) {
	this.accountNo = accountNo;
	}

	public double getBalance() {
	return balance;
	}

	public void setBalance(double balance) {
	this.balance = balance;
	}
	
	public Customer getCustomer() {
	return customer;
	}
	
	public void setCustomer(Customer customer) {
	this.customer = customer;
	}
	}

