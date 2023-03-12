package com.jsp.solution;

import java.util.Arrays;

public class RemoveNum1 {
	public static void main(String[] args) {
		String s = "2am i1 indian4 an3";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;
		}
		String[] a = new String[count + 1];
		System.out.println(count + 1);
		String temp = "";
		int k = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) != ' '&&j<s.length()-1) {
				temp = temp + s.charAt(j);
			} 
			else {
				a[k++] = temp;
				temp = "";
			}

		}
		a[k++] = temp;

		//String[] a1 = new String[count + 1];
		int num = 1, index = 0;
		while (index < a.length) {
			for (int i = 0; i < a.length; i++) {
				String s1 = a[i];

				if (s1.contains(num + "")) {
					//s1.replace(num + "", "");
					System.out.print(s1.replace(num + "", "") + " ");
					break;
				}
			}
			index++;
			num++;
		}
		

	}

}
