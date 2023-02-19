package com.jsp.basicstrings;

public class ReversingString {

	public static void main(String[] args) {
		String S="java";
		System.out.println(rev(S));
		
	}
	public static String rev(String S)
	{
		int i=0 ,j=S.length()-1;
		char [] a=S.toCharArray();
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}

}
