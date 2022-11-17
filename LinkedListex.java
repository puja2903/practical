package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListex {
public static void main(String[] args) {
	LinkedList<String > ll=new LinkedList<String>();//create a list
	ll.add("Puja");
	ll.add("priya");
	ll.add("sukhen");
	ll.add("sovan");
	ll.add("koushik");
	System.out.println("print after adding: "+ll);
	//add something
	ll.add(1,"nita");
	System.out.println("print before adding: "+ll);
	LinkedList<String > ll2=new LinkedList<String>();//create a list
	ll2.add("aaa");
	ll2.add("bbb");
	ll2.add("ccc");
	
	//adding second list to the first list
	ll2.addAll(ll2);
	System.out.println("adding second list to the first list: "+ll2);
	
	//adding 2nd list elements to the 1st list at specific position
	ll.addAll(1,ll2);
	
	//adding an elements at the first position
	ll.addFirst("skill");
	
	//remove,remove first,remove last,remove all
	ll.remove("puja");
	
	//removeFirstOccurrence,removeLastOccurrence 
	ll.removeFirstOccurrence("puja");
	ll.removeLastOccurrence("puja");
	
	/*//remove all
	ll.clear();
	
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());*/
	
	//traversing the list of elements in reverse order
	Iterator i=ll.descendingIterator();
	while(i.hasNext())
	System.out.println(i.next());
	
}
}
