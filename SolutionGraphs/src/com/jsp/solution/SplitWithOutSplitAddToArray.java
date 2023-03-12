package com.jsp.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitWithOutSplitAddToArray {
	public static void main(String[] args) {
		String s="i am in banglore";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		String [] a= new String [count+1];
		
		String temp="";
		int k=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)!=' ')
			{
				temp=temp+s.charAt(j);
			}
			else
			{
				a[k++]=temp;
				temp="";
			}
			
		}
		a[k++]=temp;
		System.out.println(Arrays.toString(a));
		int big=a[0].length();
		String bigString="";
		for(int m=0;m<a.length;m++)
		{
			if(m+1<a.length&&a[m].length()<a[m+1].length())
			{
				big=a[m+1].length();
				 bigString=a[m+1];
			}
		}
		System.out.println(big);
		System.out.println("big word in array is "+ bigString);
		
		
		
		int small=a[0].length();
		String smallString=a[0];
		for(int m=0;m<a.length;m++)
		{
			if(smallString.length()>a[m].length())
			{
				small=a[m].length();
				 smallString=a[m];	 
			}
			
			
		}
		System.out.println(small);
		System.out.println("big word in array is "+ smallString);
	}
//	public static int count1(String s)
//	{
//		int size=0;
//		for(int i=0;i<s.length();i++)
//		{
//			size++;
//		}
//		return size;
//	}
	

}
