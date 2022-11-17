package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//using get () and set() method
public class OverAllArrayList {
public static void main(String[] args) {
	List<String> a1= new ArrayList<String>();//creating arraylist using list
	
	a1.add("rose");
	a1.add("lily");
	a1.add("lotus");
	a1.add(1,"dahlia");
	a1.add(2,"orchid");
	a1.add("lavender");
System.out.println("get the element: "+a1.get(3));//access the element	
a1.set(1, "tulip");//change the element
Collections.sort(a1);//sorting	
for(String Flower:a1)//for each loop
		System.out.println(Flower);

//integer type list
List<Integer> a2= new ArrayList<Integer>();//creating arraylist using list

a2.add(64);
a2.add(86);
a2.add(78);
Collections.sort(a2);
for(Integer Number:a2)
	System.out.println(Number);
System.out.println("Array list empty or not: "+a1.isEmpty());

System.out.println(a1.retainAll(a2));//1 2 3 4 5 & 2 3 4 5 answer 3,4,5
System.out.println("size of the array: "+a2.size());

}
}
