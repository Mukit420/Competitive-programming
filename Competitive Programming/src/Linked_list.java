import java.util.LinkedList;
public class Linked_list {

	public static void main(String[] args) {
		LinkedList<String> input=new LinkedList<String>();
		input.add("Mukit");
		input.add("Arshi");
		input.add("Muhsin");
		input.add("Moli");
		input.add(3, "Mozibur");
		input.remove(0);
		System.out.println(input);
		

	}

}
