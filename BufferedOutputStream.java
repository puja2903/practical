package IO;

import java.io.FileOutputStream;

public class BufferedOutputStream {
public BufferedOutputStream(FileOutputStream f) {
		
	}

public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("D:\\test.txt");
	BufferedOutputStream bos=new BufferedOutputStream(f);
	//f.weite();
	String s="i am puja";
	byte b[]=s.getBytes();
	f.write(b);
	f.close();
	System.out.println("done");
	}catch(Exception e) {
	System.out.println(e);
}
}}
