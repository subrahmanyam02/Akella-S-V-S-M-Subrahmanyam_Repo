package com.map;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class mapdemo {
	
	public void printLoginDetails(Map<Integer,String> map){
	Set<Integer> set=map.keySet();
	Iterator<Integer> it=set.iterator();
	while(it.hasNext()){ 
		System.out.println(it.next());
	}
	}

	public static void main(String args[]){ Map<Integer,String> map=new
	LinkedHashMap<Integer,String>();
	map.put(1000,"Subbu");
	map.put(1001,"santosh");
	map.put(1002,"shiva"); 
	map.put(1003,"surya");
	System.out.println("Map after adding the elements"+map);
	mapdemo mapdemo1=new mapdemo();
	mapdemo1.printLoginDetails(map);
	}
	}



