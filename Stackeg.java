package Collection;

import java.util.Stack;

public class Stackeg {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
//checking empty or not
	boolean result=s.empty();
	System.out.println("is the stack empty?"+result);
	//adding element(push)
	s.push(25);
	s.push(35);
	s.push(40);
	s.push(55);
	s.push(80);
	s.push(75);
	//result
	System.out.println("stack element: "+s);
Integer digit=s.peek();
Integer digit2=s.pop();
System.out.println("top element: "+digit);
System.out.println("top element: "+digit2);

//search element
int digit1=s.search(35);
System.out.println("search element: "+digit1);

//find the size
int x=s.size();
System.out.println("stack size: "+x);

//find is empty or not
result=s.empty();
System.out.println("is the stack empty?"+result);}
}
