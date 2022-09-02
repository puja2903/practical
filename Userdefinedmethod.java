package Method;

import java.util.Scanner;
public class Userdefinedmethod {

	public static void main(String[] args) {
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ps.nextInt();
		checkevenodd(num);
	}
public static void checkevenodd(int num) {
		if(num%2==0)
			System.out.println(num +"is even");
		else
			System.out.println(num +"is odd");
		}}