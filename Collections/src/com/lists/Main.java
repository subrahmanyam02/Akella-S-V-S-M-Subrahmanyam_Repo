package com.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); 
		list.add("subbu");
		list.add("shukla"); 
		list.add("sandeep");
		list.add("shiva");
		AddCustomer addcustomer=new AddCustomer();
		addcustomer.printcustomer(list);

		}

}
