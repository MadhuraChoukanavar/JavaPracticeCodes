package com.jsp.basicstrings;

import java.util.Scanner;

public class stringPallindrom {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");	
		String S=scn.next();
		System.out.println(pal(S));
	}
	
	public static boolean pal( String arg)
	{
		char[] str=arg.toCharArray();
		int i=0,j=str.length-1;
		while(i<j)
		{
			if(str[i]!=str[j])return false;
				i++;
				j--;
			
		}
	return true;
		
	}
}
