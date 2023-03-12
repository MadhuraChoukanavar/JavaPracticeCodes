package com.jsp.basicstrings;

public class ArrangeInAlphaOrder {
	public static void main(String[] args) {
		String [] s= {"madhura","sahana","savita","aparna"};
		sort(s);
		for(String a:s)
		{
			System.out.println(a);
		}
	}
	public static void sort(String [] s)
	{
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-1-i;j++)
			{
				if((s[j].compareToIgnoreCase(s[j+1]))>0)
				
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
				
		}
	}
	

}
