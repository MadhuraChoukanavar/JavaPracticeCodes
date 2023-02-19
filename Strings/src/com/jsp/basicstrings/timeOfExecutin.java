package com.jsp.basicstrings;

public class timeOfExecutin {
	public static void main(String[] args) {
//		String s1="String is";
//		String s2="immutable";
//		long  startTime=System.currentTimeMillis();
//		
//	for(int i=0;i<50000;i++)
//	{
//		s1=s1+s2;
//		System.out.println(s1.hashCode());
//	}
//	long endTime= System.currentTimeMillis();
//	System.out.println("Time taken byString "+(endTime-startTime));
//	}
	
	long  startTime1=System.currentTimeMillis();
	
	StringBuffer s3=new StringBuffer("String is");
	StringBuffer s4=new StringBuffer("immutable");
	for(int i=0;i<50000;i++)
	{
		s3.append(s4);
		System.out.println(s4  .hashCode());
		
	}
	long endTime1=System.currentTimeMillis();
	System.out.println("Time taken by stringBuffer"+(endTime1-startTime1));
	
}
}
