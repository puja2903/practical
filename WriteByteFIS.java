package IO;

import java.io.FileInputStream;

public class WriteByteFIS {
	public static void main(String[] args) {
		try {
			//write byte
			FileInputStream f=new FileInputStream("D:\\test1.txt");  //destination
		/*int i=f.read();
		System.out.println((char)i);
		
		 f.close();}*/
		//read all character 
		 int i=0;
		   while((i=f.read())!=-1){
			System.out.println((char)i);//convert into character
		   }
		   f.close();}
catch(Exception e) {
			System.out.println(e);
		}}}
