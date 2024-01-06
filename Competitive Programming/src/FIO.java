import java.io.BufferedReader;
import java.io.FileReader;

public class FIO{
	public static void main(String[] args) throws Exception {
		BufferedReader reader=new BufferedReader(new FileReader("D:\\Java program\\input.txt"));
	    reader.readLine();
	    String line;
	    while((line=reader.readLine())!=null) {
	    	System.out.println(line);
	    }
	    reader.close();
	}
}