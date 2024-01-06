import java.util.*;

public class Super {
	public static void main(String[] A) {
		Scanner s = new Scanner(System.in);
		int v = s.next().compareToIgnoreCase(s.next());
		System.out.print(v < 0 ? -1 : v > 0 ? 1 : 0);
	}
}