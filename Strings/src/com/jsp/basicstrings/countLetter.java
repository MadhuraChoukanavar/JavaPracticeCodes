package com.jsp.basicstrings;

import java.util.Scanner;

public class countLetter {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next().toLowerCase();
		
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s2=s.replace(c+"","");
			int count =s.length()-s2.length();
			System.out.println(c+"="+count);
//			System.out.println(s);
//			System.out.println(s2);
			s=s2 ;
//			System.out.println(s);
//			System.out.println(s2);
			}
		}

}
