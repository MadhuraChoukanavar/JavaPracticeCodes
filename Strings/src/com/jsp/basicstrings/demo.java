
package com.jsp.basicstrings;

public class demo {
	public static void main(String[] args) {
		String s="the string id immutable";
		char[] a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
