package com.jsp.basicstrings;

public class convertCase {

	private static String c;
	public static void main(String[] args) {
		String s="java";
		System.out.println(changeCase(s));

	}
//	public static String changeCase(String s)
//	{
//		char[] a=s.toCharArray();
//		for(int i=0;i<s.length();i++)
//		{
//			if(a[i]>='a'&&a[i]<='z') a[i]=(char)(a[i]-32);
//			else if(a[i]>='A'&&a[i]<='Z') a[i]=(char)(a[i]+32);
//		}
//		return new String(a);
//	}
	public static String changeCase(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z') c=(char)(c-32);
			else if(c>='A'&&c<='Z') c=(char)(c+32);
		}
		return new String(c);
	}
}