public class Recursion{
	public static void re(int i) {
		
		if(i==0)
			return;
		
		else
			System.out.println(i);
			re(i-1);
		
	}
	public static void main(String[] args) {
		Recursion m=new Recursion();
		m.re(5);
	}
}