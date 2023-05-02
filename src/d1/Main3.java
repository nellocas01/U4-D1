package d1;

import java.util.Scanner;

public class Main3 {
	
	public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("inserisci tre stringhe");
		String concat = in.nextLine();
		System.out.println("Hai eseguito la concatenazione normale: " + concat);
		concat = reverse(concat);
		System.out.println("Hai eseguito la concatenazione invertita: " + concat);
		in.close();
	}
}
