package com.jsp.basicstrings;

import java.util.Scanner;

public class printNumInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				System.out.print(c);
			}
		}
	}

}
