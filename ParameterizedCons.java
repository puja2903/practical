package YouConstractor;

public class ParameterizedCons {
	int x,y,a,b;
	ParameterizedCons(int a,int b){  //passing primitive data type
		x=a;y=b;
		System.out.println(x+" "+y);//without creating any method print the value
	}
	
	
	ParameterizedCons(int a,String b){  //passing primitive data type
		System.out.println(a+" "+b);
	}
		
/*void show()         //create a method to print
{
	System.out.println(x+" "+y);
}*/
}
class Dis{
	public static void main(String[] args) {
		ParameterizedCons r= new ParameterizedCons(101,420);
		ParameterizedCons k= new ParameterizedCons(900,"puja");
		//r.show();
	}
}