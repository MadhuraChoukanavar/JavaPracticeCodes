package com.jsp.basicstrings;

import java.util.Scanner;

public class AllPal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String as Input");
		String s = scn.next().toLowerCase();
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ispallindrome(s, i, j))
					System.out.println(s.substring(i, j + 1));
			}
		}

	}

	public static boolean ispallindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
