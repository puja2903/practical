package Array;
//return an array from the method
public class Array4 {

	//creating method which return the array	
		 static int[] printarray(){
			
			return new int[]{1,2,3,4,5};
		 }
		 public static void main(String[] args) {
		//calling method
			 int arr[]=printarray();
			 //traversing the array
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		}

		
}
