import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		ArrayList<String> strings = new ArrayList<String>();
		strings.add(A);
		strings.add(B);

		int total = 0;
		for (String s : strings) {
			total += s.length();
		}
		System.out.println(total);

		if (A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");

		for (String s : strings) {
			char c = Character.toUpperCase(s.charAt(0));
			System.out.print(c + s.substring(1) + " ");
		}

	}
}
