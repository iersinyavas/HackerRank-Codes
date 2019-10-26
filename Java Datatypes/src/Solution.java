import java.util.*;
import java.io.*;

class Solution {

	public static long power(int x) {
		long r = 1;
		for (int k = 0; k < x; k++) {
			r = r * 2;
		}
		return r;
	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				// Complete the code
				if (x >= -Solution.power(15) && x <= Solution.power(15) - 1)
					System.out.println("* short");
				if (x >= -Solution.power(31) && x <= Solution.power(31) - 1)
					System.out.println("* int");
				if (x >= -Solution.power(63) && x <= Solution.power(63) - 1)
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
