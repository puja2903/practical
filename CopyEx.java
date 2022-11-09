package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyEx {
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("D://test.txt");//read
		FileOutputStream fout=new FileOutputStream("E://test.txt");  //write
	byte []arr=new byte[1024];
	int l;
	while((l=fin.read(arr))>0) {
		fout.write(arr);
	}
	fin.close();
	fout.close();
	System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
