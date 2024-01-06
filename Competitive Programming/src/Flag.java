import java.util.Scanner;

public class Flag {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int col=input.nextInt();
		int row=input.nextInt();
		int[][] mat=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=input.nextInt();
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
