package com.jsp.basicstrings;

import java.util.Scanner;

public class SumOfNumInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		String s=scn.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				int n=c-'0';
				sum+=n;
			}
		}
		System.out.println(sum);
	}

}
