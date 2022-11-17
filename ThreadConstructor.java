package Thread;
/*
public class ThreadConstructor {
public static void main(String[] args) {
	
	//creating object of thread class using constructor
	Thread obj=new Thread("puja"); 
	obj.start();  //move to active state
	String str=obj.getName(); //thread name by invoking get name method
	System.out.println(str);
}}*/

//runnable interface
public class ThreadConstructor implements Runnable {
	public void run() {
		System.out.println("thread activated");
	}
public static void main(String[] args) {
	Runnable r=new ThreadConstructor();
	//creating object of thread class using constructor
	Thread obj=new Thread("puja"); 
	obj.start();  //move to active state
	String str=obj.getName();//thread name by invoking get name method
	System.out.println(str);
}
}
