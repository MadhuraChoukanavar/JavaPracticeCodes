package com.jsp.basicstrings;

import java.util.Scanner;

public class printNumInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next();
		String s1="";
		for(int i=s.length()-1;i>0;i--)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				s1=c+ ""+s1;
			}
		}
		System.out.println(s1);
	}

}
