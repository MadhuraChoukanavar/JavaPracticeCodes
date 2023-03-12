package com.jsp.basicstrings;

import java.util.Scanner;

public class BigPallindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String s = scn.next().toLowerCase();
		String bigPal = "";
		String bigPal1 = "";
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ispallindrome(s, i, j)) {
					String temp = (s.substring(i, j + 1));
					if (temp.length() > bigPal.length())
						bigPal = temp;
					    bigPal1 = bigPal;
					System.out.println(bigPal);
				}

			}

		}

		System.out.println(bigPal);

	}

	public static boolean ispallindrome(String s, int Start, int end) {
		int i=Start,j=end;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}