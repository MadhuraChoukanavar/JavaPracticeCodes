package com.jsp.basicstrings;

public class Permutation {
	public static void main(String[] args) {
		permulation1("abc",0,2);
		
	}
     public static void  permulation1(String s ,int start ,int end)
     {
    	 if(start>=end)
    	 {
    		 System.out.println(s);
    		 return;
    	 }
     
     for(int i=start;i<=end;i++)
     {
    	String s1=swap(s,start,i);
    	permulation1(s1,start+1,end);
    	
     }
     }
    static String swap(String s,int i,int j)
    {
    	char[] a=s.toCharArray();
    	char temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    	return new String (a);
    	
    }
     
}
