package Thread;

public class JoinMethodThread extends Thread {
	@Override 
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}}
public static void main(String[] args) {
	JoinMethodThread t=new JoinMethodThread();
	JoinMethodThread t1=new JoinMethodThread();
	JoinMethodThread t2=new JoinMethodThread();
	
	
	t.start();
	try { 
		t.join();
	}catch(Exception e) {
		System.out.println(e);}
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);}
		
	t2.start();
	
}}


