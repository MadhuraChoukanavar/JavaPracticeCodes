package com.jsp.basicstrings;

public class RevWithoutSplitinh {

	public static void main(String[] args) {
		String s="i like java programming";
		char[] a=s.toCharArray();
		String s1=" ";
		int len=a.length;
		int i=0,j=0;
		while(j<len)
		{
			while(j<len && a[j]!=' ')j++;
			String temp=" ";
			int k=j-1;
			while(k>=i)
			{
				temp=temp+a[k];
				k--;
			}
			
			s1=s1+temp;
			if(j<len)s1+=" ";
				j++;
				i=j;
		}
		System.out.println(s1);
	}

}
