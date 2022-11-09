package IO;

import java.io.FileOutputStream;

public class WriteByteFOS {
public static void main(String[] args) {
	try {
		//write byte
		FileOutputStream f=new FileOutputStream("D:\\test.txt");  //destination
	f.write(67);
	 f.close();
	 System.out.println("done");
	 /*
		//write string
		String s="puja sarkar";
		byte b[]=s.getBytes();  //converting strin g into byte array
		f.write(b);
		f.close();
		System.out.println("done");*/
		
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
