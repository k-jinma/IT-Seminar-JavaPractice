package toi2;

import java.util.ArrayList;

public class ListStringTest {

	public static void main(String[] args) {
		ListString ls = new ListString();

		ls.readLine("iroha.txt"); // args[0]

		ArrayList<String> ar;
		ar = ls.getLine();

		for( String s : ar ) {
			System.out.println(s);
		}
	}

}
