package com.sets;

import java.util.Set;
import java.util.HashSet;
public class demosets {
	public void printSetRecords(Set<String> set){
	if(set.isEmpty()){
	System.out.println("Set is an empty set");
	}else {
	System.out.println("Set elements are :"+ set);
	}
	}
	
	public static void main(String args[]){
	
	Set<String> set=new HashSet<String>();
	set.add("sandeep");
	set.add("subbu");
	set.add("sakina");
	demosets setDemo=new demosets ();
	setDemo.printSetRecords(set);
	Set<String> emptySet=new HashSet<String>();
	demosets demosets = new demosets();
	 demosets.printSetRecords(emptySet);
	}



}

