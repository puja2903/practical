package YouConstractor;

public class Privatecons {
	int a;double b;String c;
	private Privatecons() {
		a=22;
		b=55.00;
		c="puja";
		System.out.println(a+" "+b+" "+c);
	}
	void show() {
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {     //create object in one class because of private keyword 
		Privatecons r=new Privatecons();
		r.show();
	}

}
//no need to create another class.