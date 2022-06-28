package collection_List_ArrayList;

import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
	//Declare ArrayList
		
   // List al=new ArrayList();
	//ArrayList<String> al=new ArrayList<String>();
	//ArrayList<Integer> al=new ArrayList<>();
		ArrayList al=new ArrayList();
		al.add("Ram");
		al.add(25);
		al.add("Akhila");
		al.add(18);
		al.add("Sagar");
		al.add(23);
		System.out.println(al); // [Ram, 25, Akhila, 18, Sagar, 23]
		
		// size()
		System.out.println("Number of elements in ArrayList : "+al.size()); //6
		
		//remove ()
		al.remove(5); //Here 5 is index
		al.remove("Ram");//Here Ram is element
		System.out.println("After removing the Elements in ArrayList : "+al); //[25, Akhila, 18, Sagar]
		
		//insert a new element 
		//add(index,object);
		al.add(0,"Ram Murthi");
		al.add("Rasool");
		System.out.println("After inserting the value : "+al);  //[Ram Murthi, 25, Akhila, 18, Sagar, Rasool]
		
		//Retreive Specific element
		//al.get(Object);
		System.out.println(al.get(2));//Akhila here 2 is the index of element(Akhila) or Object
		
		//Change or Replace the element
		//set(index,object);
		al.set(5,23);
		System.out.println("After changing the value at index 5 : "+al); //[Ram Murthi, 25, Akhila, 18, Sagar, 23]
		
		
		//Searching --contains();-->Return true/false
		System.out.println(al.contains("Akhila"));  //true
		System.out.println(al.contains("Raju"));  // false
		
		//isEmpty()
		System.out.println(al.isEmpty()); //false
		
		
		//1) For Loop
		
		System.out.println("----------  Reading the data by using For Loop -------------");
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		// 2)for....each loop
		System.out.println("----------  Reading the data by using For-each Loop -------------");
		for(Object e:al) {
			System.out.println(e);
		}
		
		// 3) iterator()
		System.out.println("----------  Reading the data by using Iterator method -------------");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {              // search next element
			System.out.println(it.next());  //Printing the element the element and move to the next element 
		}
				
		
		

	}

}
