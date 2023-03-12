package com.jsp.solution;

import java.util.Arrays;
import java.util.Scanner;

public class fibonace {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println(" enter the numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int l=scn.nextInt();
		int c=0;
		int [] even=new int[(l/2)+1];
		int [] odd=new int[(l/2)];
		int j=0;
		int k=0;
		
		for(int i=1;i<=l;i++)
		{
			if(i%2==0)
			{
				odd[k++]=a;
			}
			else
			{
				even[j++]=a;
			}
			c=a+b;
			a=b;
			b=c;
			
			scn.close();
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
	for(int i=0;i<even.length;i++)
	{
		printSpace(i);
		System.out.println(even[i]);
	}
	for(int i=0;i<odd.length;i++)
	{
		printSpace(odd.length-1-i);
		System.out.println(odd[odd.length-1-i]);
	}
		
}
	public static void printSpace(int num)
		{
		for(int i=0;i<=num;i++)
		{
			System.out.print(" ");
		}
		}
		
		
		
		
//		for(int m=0;m<even.length;m++)
//		{
//			System.out.print(even[m]);
//		}
//		System.out.println();
//		for(int n=0;n<odd.length;n++)
//		{
//			System.out.print(odd[n]);
//		}
//        k=odd.length-1;;
//        j=0;
//		for(int i=1;i<=l;i++)
//		{
//			for(int j1=1;j1<l ;j1++)
//			{
//				if( j<even.length && i==j1)
//				{
//				System.out.print(even[j++]);
//				}
//				else if( k>=0&& i>(l/2)+1&&i+j1==l+1)
//				{
//					System.out.print(odd[k--]);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//				
//				
//			}
//			System.out.println();
//		}
		
		
		
		
	

}
