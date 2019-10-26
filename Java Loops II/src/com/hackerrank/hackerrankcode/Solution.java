package com.hackerrank.hackerrankcode;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<List<Integer>> numberList = new ArrayList<List<Integer>>();
		for (int i = 0; i < t; i++) {
			List<Integer> numbers = new ArrayList<Integer>();
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			numbers.add(a);
			numbers.add(b);
			numbers.add(n);
			numberList.add(numbers);
		}

		for (int i = 0; i < t; i++) {
			int previous = 0;
			for (int j = 0; j < numberList.get(i).get(2); j++) {
				previous += numberList.get(i).get(1) * Math.pow(2, j);
				System.out.print((previous + numberList.get(i).get(0)) + " ");
			}
			System.out.println("");
		}
		in.close();
	}
}
