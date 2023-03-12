package com.jsp.solution;

import java.util.ArrayList;

public class PrimePattern {
	public static void main(String[] args) {

		int x = 1;
		int y = 41;

		int count = 0;
		ArrayList even = new ArrayList();
		ArrayList odd = new ArrayList();
		for (int i = x; i <= y; i++) {
			if (i <= 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				if (count % 2 == 0) {
					even.add(i);
				} else {
					odd.add(i);
				}

			}

		}
		System.out.println("even" + even);
		System.out.println("odd" + odd);

//		int l = count;
//		System.out.println(count);
//		int k = 0;
//		int p = odd.size() - 1;
//
//		for (int m = 1; m <= l; m++) {
//			for (int n = 1; n <= l; n++) {
//				if (k < even.size() - 1 && l <= l / 2 && m+n==l+1) {
//					System.out.print(even.get(k++));
//				} else if (p >= 0 && l > (l / 2) + 1 && m == n) {
//					System.out.print(odd.get(p--));
//				} else
//
//				{
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}

		for (int i = 0; i < even.size(); i++) {
			printSpace(even.size() - i);
			System.out.println(even.get(i));
		}
		for (int i = 0; i < odd.size(); i++) {
			printSpace(i);
			System.out.println(odd.get(odd.size() - 1 - i));
		}

//		for (int i = 0;i < even.size(); i++) {
//			printSpace(i);
//			System.out.println(even.get( i));
//		}
//		for (int i = 0; i < odd.size(); i++) {
//			printSpace(odd.size()-i-1);
//			System.out.println(odd.get(odd.size()- 1 - i));
//		}

	}

	public static void printSpace(int num) {
		for (int i = 0; i < num; i++)
			System.out.print(" ");
	}

}
