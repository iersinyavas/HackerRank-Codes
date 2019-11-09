import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		BigInteger ai = sc.nextBigInteger();
		BigInteger bi = sc.nextBigInteger();
		BigInteger sum = ai.add(bi);
		BigInteger mul = ai.multiply(bi);
		System.out.println(sum);
		System.out.println(mul);
	}
}
