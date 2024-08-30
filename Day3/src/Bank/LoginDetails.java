package Bank;




import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class LoginDetails{

public void addSameKey(Map<Integer,String> map){
if(map.containsKey(1003)){
System.out.println("Key is already present in map");
}
 



}

public void printLoginDetails(Map<Integer,String> map){

Set<Integer> set=map.keySet();
Iterator<Integer> iterator=set.iterator();






while(iterator.hasNext()){ System.out.println(iterator.next());
}
}

public static void main(String args[]){ Map<Integer,String> map=new
LinkedHashMap<Integer,String>();
map.put(1000,"Subbu"); map.put(1001,"Sharukh"); map.put(1002,"Sailesh"); map.put(1003,"Sunil");
System.out.println("Map before adding the same key 1003"+
map);
LoginDetails loginDetails=new LoginDetails();
loginDetails.addSameKey(map);
System.out.println("Value for 1003, after addSameKey() : "+map.get(1003));
System.out.println("Map after adding the same key 1003"+
map);
loginDetails.printLoginDetails(map);
}
}

