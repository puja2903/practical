package IO;
import java.io.FileReader;
public class FileReadereg {
public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("D://test.txt");
	int i;
	while ((i=fr.read())!=-1) {
		System.out.println((char)i);
	}
	fr.close();
	System.out.println("done");
	
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
