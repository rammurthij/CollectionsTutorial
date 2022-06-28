package collection_Map;
import java.util.*;
public class HashMapDemo1 {

	public static void main(String[] args) {
	//	Map<Integer,String> m=new HashMap<>();
	Map m=new HashMap();
	
	m.put(101,"RRR");
	m.put(102,"BheemlaNayak");
	m.put(103,"KGF");
	m.put(104,"RRR");
	m.put(105,"ThankYou");
	m.put(106,"Major");
	m.put(null,"KGF");
	System.out.println(m);
	System.out.println(m.keySet()); //return all the keys
	System.out.println(m.values());  //return all the values
	System.out.println(m.entrySet()); //[101=RRR, 102=BheemlaNayak, 103=KGF, 104=RRR, 105=ThankYou, 106=Major, 107=KGF]
	
	System.out.println(m.get(105));   //ThankYou
	
	m.remove(106);
	System.out.println(m); //removed 106 key  {101=RRR, 102=BheemlaNayak, 103=KGF, 104=RRR, 105=ThankYou, 107=KGF}
	
	
	System.out.println(m.containsKey(103)); //true
	System.out.println(m.containsKey(106)); //false
	
	System.out.println(m.containsValue("Major")); //false
	System.out.println(m.containsValue("RRR"));//true
	
	
	for(Object i:m.keySet()) {
		System.out.println(i);
	}
	
	for(Object i:m.values()) {
		System.out.println(i);
	}
	
	for(Object i:m.entrySet()) {
		System.out.println(i);
	}
	
	}

}
