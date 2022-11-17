package Collection;

public interface FunctionalInterface {
//void add();
	int add(int a,int b);
}
class Lambdaeg{
	public static void main(String[] args) {
		FunctionalInterface obj=(a,b)->{return (a+b);
		//System.out.println("i am functional interface implemented by lambda expressions");
		};
		System.out.println((obj.add(40,50)));
		//obj.add();
		}
	}

