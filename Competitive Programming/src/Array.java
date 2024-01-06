import java.util.Scanner;

public class Array{
	public static void main(String[] args) {
		int n=5,i;
		Scanner input = new Scanner(System.in);
		int[] array=new int[n];
		System.out.println("input array element");
		for(i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		for(i=0;i<n;i++) {
			System.out.print(" "+ array[i]);
		}
	}
}