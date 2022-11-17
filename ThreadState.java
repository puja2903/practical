package Thread;
/*
//using thread class
public class ThreadState extends Thread {
public void run() {
	System.out.println("thread activated");
}
public static void main(String[] args) {
	ThreadState obj=new ThreadState();
	obj.start();
}}*/

//using runnable interface
public class ThreadState implements Runnable{
public void run() {
	System.out.println("thread activated");
}
public static void main(String[] args) {
	ThreadState obj=new ThreadState();
	Thread t1=new Thread(obj);  //explicitly creating thread object
	t1.start();
}}