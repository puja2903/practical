package IO;

import java.io.IOException;
import java.io.*;
public class FileWritereg {
public static void main(String[] args) {
	try {
		FileWriter f=new FileWriter("D://test.txt");
	
			f.write("puja sarkar");
	System.out.println("done");
	}
	catch(IOException e) {
		System.out.println(e);
	}
	
}
}
