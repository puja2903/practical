//find maximum number within the array.
package Array;

public class ArrayExample2 {
public static void main(String[] args) {
int a[]= {10,20,30};
System.out.println(largenumber(a));
}
public static int largenumber(int a[]) {
	//public static void largenumber(int a[]) {
	int max=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]>max)
		max=a[i];
	  }
//System.out.println(max);
return max;
   }

 }
