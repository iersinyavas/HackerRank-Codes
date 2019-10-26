import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		String[] words = s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();

		for (String word : words) {
			stringBuilder.append(word.trim() + " ");
		}
		String string = stringBuilder.toString();

		String[] symbols = { "!", ",", "?", ".", "_", "'", "@", "-", "{", "}", "  " };
		String s1 = null;
		for (String symbol : symbols) {
			if (string.contains(symbol)) {
				s1 = string.replace(symbol, " ");
			}
			if (s1 == null)
				continue;
			else {

				string = s1.trim();
			}
		}

		String[] wordArray = s1.split(" ");
		System.out.println(wordArray.length);

		for (String word : wordArray) {
			System.out.println(word.trim());

		}
		scan.close();
	}
}
