import java.util.Stack;

public class Stac{
	public static void main(String[] args) {
		Stack<Integer> number=new Stack<>();
		number.push(10);
		number.push(20);
		number.push(30);
		number.push(40);
		number.push(50);
		number.push(60);
		number.pop();
		System.out.println(number);
	}
}