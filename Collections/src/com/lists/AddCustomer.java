package com.lists;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class AddCustomer {	
public void printcustomer(List<String> list)
{
	Iterator<String> it=list.iterator();
	System.out.println("The customers in the list are as follows");
	while(it.hasNext())
	{
	System.out.println(it.next());	
	}
}


	}




