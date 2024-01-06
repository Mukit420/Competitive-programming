import java.util.Scanner;

public class Binary_Tree{
	public static Scanner sc=null;
	public static void main(String[] args) {
		 sc=new Scanner(System.in);
		create_tree();
	}
	public static node create_tree(){
		System.out.println("Enter data");
		int data=sc.nextInt();
		if(data==-1)return null;
		node root=new node(data);
		System.out.println("Enter left value for"+data);
		root.left=create_tree();
		System.out.println("Enter right value for"+data);
		root.right=create_tree();
		return root;
	}
}
class node{
	node left;
	node right;
	int data;
	node(int data){
		this.data=data;
	}
}