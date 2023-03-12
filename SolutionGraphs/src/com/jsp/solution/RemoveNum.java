package com.jsp.solution;
import java.util.Arrays;
public class RemoveNum {
	public static void main(String[] args) {
		String s = "2am i1 Indian4 an3";
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
			char c = s.charAt(j);
			if (c!=' ') {
				if (c>='0' && c<='9') {
					k = c - '0';
					temp = temp;
				} else {
					temp = temp + c;
				}
			} else {
				a[--k] = temp;
				temp = "";
			}	
		}
		System.out.println(Arrays.toString(a));
	}
}

//    public static String test(String s)
//    {
//    	for(int i=0;i<s.length();i++)
//    	{
//    		
//    	}
//    }

