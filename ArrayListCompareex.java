package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareex {
public static void main(String[] args) {
	List<String> a1=new ArrayList<String>();//declaring arraylist
	//method add()
	a1.add("Rose");
	a1.add("Tulip");
	a1.add("marigold");
	a1.add(0,"daisy");//we can add element in any specified index position
	a1.add("lily");
	a1.add(2,"sunflower");
	a1.add("lavendor");
	a1.add(5,"orchid");
	System.out.println(a1);
	
	List<String> a11=new ArrayList<String>();//declaring arraylist
	//method add()
	a1.add("Rose");
	a1.add("Tulip");
	a1.add("marigold");
	a1.add(0,"daisy");//we can add element in any specified index position
	a1.add("lily");
	a1.add(2,"sunflower");
	a1.add("lavendor");
	a1.add(5,"orchid");
	System.out.println(a11);
	//compare array list
	boolean b=a1.equals(a11);
	System.out.println(b);
	a11.add("red rose");
	boolean b1=a1.equals(a11);
System.out.println(a11);	
}
}
