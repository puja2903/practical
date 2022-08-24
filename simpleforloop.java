package Operator;

public class simpleforloop {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++)//outer loop
		for(int j=1;j<i;j++)//inner loop
		{  //i=1,i=2,
		System.out.print(i+" "+j);
		}
	}

}
