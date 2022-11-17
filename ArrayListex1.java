package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListex1 {
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
	
	System.out.println("size of array: "+a1.size());//define the number of element using size()
	System.out.println(a1);
	System.out.println("element of index value 4 is: "+a1.get(4));//specific element of given index
	a1.remove(5);//remove element from list using remove()
	
	System.out.println("size of array: "+a1.size());
	System.out.println(a1);
	}
}
