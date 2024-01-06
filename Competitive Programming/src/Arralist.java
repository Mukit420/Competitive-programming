import java.util.ArrayList;
import java.util.Scanner;

public class Arralist{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> arra=new ArrayList<>();
		System.out.println("Input");
		while(in.hasNextInt()) {
			arra.add(in.nextInt());
		}
		System.out.println("output-->"+arra);
		System.out.println(arra.size());
		
	}
}