 package com.jsp.basicstrings;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next().toLowerCase();
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	}

	
