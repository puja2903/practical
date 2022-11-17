package Collection;
import java.util.Vector;
public class Vectorex {
public static void main(String[] args) {
	//creating vector
	Vector<String> vc=new Vector<String>(4);
	vc.add("dog");
	vc.add("cat");
	vc.add("cow");
	vc.add("lion");
	
	//checking size and capacity
	System.out.println("size: "+vc.size());
	System.out.println("size: "+vc.capacity());
	
	//add more elements
	vc.addElement("tiger");
	vc.addElement("elephent");
	System.out.println("after addding elements: ");
	System.out.println("size: "+vc.size());
	System.out.println("size: "+vc.capacity());
	
	//checking cat is present or not
	System.out.println(vc);
	if(vc.contains("cat")) {
		System.out.println("present");
	}else {
		System.out.println("not present");
	}
	System.out.println("1st element: "+vc.firstElement());
	System.out.println("last element: "+vc.lastElement());
	System.out.println("index: "+vc.indexOf("cow"));
	
	
}
}
