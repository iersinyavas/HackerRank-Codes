package com.hackerrank.hackerrankcode;

import java.io.*;
import java.util.*;

import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			int value = scan.nextInt();
			list.add(value);
		}

		int querySize = scan.nextInt();
		for (int i = 0; i < querySize; i++) {
			String event = scan.next();
			if (event.equals("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				list.add(index, value);
			} else {
				int index = scan.nextInt();
				list.remove(index);
			}
		}
		scan.close();

		for (Integer number : list) {
			System.out.print(number + " ");
		}
	}
}
