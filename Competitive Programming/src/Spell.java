import java.util.Scanner;

public class Spell {
	public static void main(String[] args) {
		String s="";
		char ch;
		 
	      for( ch = 'a' ; ch <= 'z' ; ch++ ) {
	         s+=ch;
	   }
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		String plain=sc.next();
		String key=sc.next();
		for(int i=0;i<plain.length();i++) {
			if(i==key.length()) {
				i=0;
			}
			key+=key.charAt(i);
			if(plain.length()==key.length()){
				break;
			}
		}
		System.out.println(key);
		
		}
	}

