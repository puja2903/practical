package Constractor;

public class Defaultcon {
	int age;
	String name;
	void show() {
	System.out.println(age+" "+name);}
	public static void main(String[] args) {
		Defaultcon ps=new Defaultcon();
		Defaultcon ps1=new Defaultcon();
		ps.show();
		ps1.show();
		}}
