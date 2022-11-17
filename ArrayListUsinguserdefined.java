package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsinguserdefined {
public static void main(String[] args) {
	Bank b=new Bank(123454,"ram",500.78,20);
	Bank b1=new Bank(67849,"sam",578.78,12);
	Bank b2=new Bank(123454,"karan",435.78,10);
	Bank b3=new Bank(123454,"ramu",869.78,11);
	Bank b4=new Bank(123454,"lily",768.78,13);
	Bank b5=new Bank(123454,"aman",657.78,15);
	
	ArrayList<Bank> a1=new ArrayList<Bank>();
	a1.add(b);
	a1.add(b1);
	a1.add(b5);
	a1.add(b3);
	a1.add(b2);
	a1.add(b4);
	
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		Bank obj=(Bank) itr.next();
		System.out.println(obj.accountno +" "+obj.customername +obj.balance +obj.customerAge );
	}
	
	
}
}
