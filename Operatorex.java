package Operator;

public class Operatorex {

	public static void main(String[] args) {
		//initialize a & b
		int a=12;
		int b= 34;
		System.out.println(a*b);//arithmetic operation
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		
		System.out.println(a<b || b<a);//logical operation
		System.out.println(a<b && b<a);
		
		System.out.println(a++ + ++a);//unary operation
		System.out.println(b-- + --b);
		
		System.out.println(a>b);//relational operation
		System.out.println(b>a);

	}

}
