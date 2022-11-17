package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
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
		//convertion of list to array
		System.out.println("list to array");
		String []arr=a1.toArray(new String[a1.size()]);
		for(String s: arr) {
			System.out.println(s);
		}
		System.out.println("array to list");
		List<String> a11=new ArrayList<String>();
		a11=Arrays.asList(arr);
		
	}

}
