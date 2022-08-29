
public class objref1 {
	int age;
	String name;
}
class objref{
	public static void main(String[] args) {
		objref1 obr=new objref1();
		objref1 obr1=new objref1();
		objref1 obr2=new objref1();
		obr.age=25;
		obr.name="sukhen";
		obr1.age=30;
		obr1.name="sulata";
		obr2.age=25;
		obr2.name="sovan";
		System.out.println(obr.age+" "+obr.name);
		System.out.println(obr1.age+" "+obr1.name);
		System.out.println(obr2.age+" "+obr2.name);
		
	}
}



