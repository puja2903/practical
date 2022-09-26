// Anonymous array in java

package Array;

public class Arrayex3 {
public static void main(String[] args) {
	
	display(new int[] {10,20,30,40,50});//passing anonymous array.
}
//creating a method which receive an array as a parameter
	static void display(int arr[]) { //no need to declare  the array while passing an array to the method.
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	
}
}
