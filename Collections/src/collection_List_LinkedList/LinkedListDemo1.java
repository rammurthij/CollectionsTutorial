package collection_List_LinkedList;
import java.util.*;
public class LinkedListDemo1 {

	public static void main(String[] args) {
		List ls=new LinkedList();
		
		ls.add("A");
		ls.add("R");
		ls.add("B");
		ls.add("C");
		ls.add("E");
		ls.add("D");
		ls.add("F");
		ls.add("H");
		ls.add("G");
		
		System.out.println(ls.get(8));
		
		System.out.println(ls.size());
		
		ls.set(8,"A");
		System.out.println(ls);
		
		ls.add(0,"Ram Murthi");
		ls.remove(0);
		System.out.println(ls);
		
		for(int i=0; i<ls.size();i++) {
			System.out.println(ls.get(i));
			
			
		}
		for(Object e:ls) {
			System.out.println("for each "+e);
		}

		Iterator it=ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
