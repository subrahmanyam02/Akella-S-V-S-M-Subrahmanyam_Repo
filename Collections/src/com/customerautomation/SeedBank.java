package com.customerautomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.customerautomation.CustomerDB;
import com.customerautomation.Customer;
import com.customerautomation.Login;

public class SeedBank {


	private static final CustomerDB customerDB=new CustomerDB();
	
	private static final Login login=new Login();

	public static void main(String[] args) {
	Customer cust1=new Customer(1001,"subbu",false);
	customerDB.saveCustomer(cust1);
	//customer availing the online service 
	login.addLogin(1001, "aaas@123");

	Customer cust2=new Customer(1002,"sarvesh",true);
	customerDB.saveCustomer(cust2);
	login.addLogin(1002, "aas@123");

	Customer cust3=new Customer(1003,"shiva",true);
	customerDB.saveCustomer(cust3);
	login.addLogin(1003, "as@123");

	Customer cust4=new Customer(1004,"shukla",false);
	customerDB.saveCustomer(cust4);
	login.addLogin(1004, "s@123");

	List<Customer> customerList=customerDB.getAllCustomers();

	if(customerList.isEmpty()){
	System.out.println("No Customers in the Bank");
	}else{
		printCustomerList(customerList);
	}

	Set<Integer> loanAvailedCustomers =
	customerDB.getLoanAvailedCustomers();
	System.out.println("\nCustomers who have Availed the loan");
	System.out.println("------------------------------------");
	for(int custId:loanAvailedCustomers){
		System.out.println(custId);
	}
	}

	public static void printCustomerList(List<Customer>
	customerList){
	Iterator<Customer> custIterator = customerList.iterator();
	System.out.println("Customer Details"); System.out.println("------------------------------"+"-------------"); System.out.println("cust Id\tcustomer Name\tLoan"+"Availed");
	while(custIterator.hasNext()){
	Customer customer=custIterator.next();
	System.out.print(customer.getCustomerId()+"\t");
	System.out.print(customer.getCustomerName()+"\t\t");
	String displayString="NO"; 
	if(customer.isLoanAvailed()){
	displayString="YES";
	} System.out.println(displayString);
	}
	}
	}

	
