package collection_List_ArrayList;

import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		List al=new ArrayList();
		al.add("Ram");
		al.add("Venky");
		al.add("Rajesh");
		al.add("Shareef");
		al.add("Poola");
		al.add("Surya");
		al.add("Sowji");
		
		
		
		List LTI=new ArrayList();
		LTI.addAll(al);
		System.out.println(LTI);  //[Ram, Venky, Rajesh, Shareef, Poola, Surya, Sowji]
		
		LTI.removeAll(al);
		
		System.out.println("After removing the elements in ArrayList :"+LTI);  //[]
		
		// sorting -----collections.sort()------
		
		System.out.println("Elements in a arrayList :"+al);  //[Ram, Venky, Rajesh, Shareef, Poola, Surya, Sowji]
		
		Collections.sort(al);
		System.out.println("Elements in a arrayList after sorting :"+al); //[Poola, Rajesh, Ram, Shareef, Sowji, Surya, Venky]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in a arrayList after sorting in reverseOrder :"+al);//[Venky, Surya, Sowji, Shareef, Ram, Rajesh, Poola]
		
		//Shuffling ----Collections.shuffle()
		
		Collections.shuffle(al);
		System.out.println("Elements in a arrayList after sorting in shuffle :"+al);//[Sowji, Rajesh, Surya, Poola, Ram, Shareef, Venky]
		
		
		

	}

}
