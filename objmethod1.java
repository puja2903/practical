
public class objmethod1 {
	String name;
	int age;
	void input(String n,int a)
	{
		age=a;
		name=n;
	}
	void display() {
		System.out.println(name+""+age);
	}
	class objmethod{
		public static void main(String...args) {
			objmethod1 ps=new objmethod1();
			objmethod1 ps1=new objmethod1();
			ps.input("sovan",  25);
			ps1.input("puja",  22);
			ps.display();
			ps1.display();
			}}}
