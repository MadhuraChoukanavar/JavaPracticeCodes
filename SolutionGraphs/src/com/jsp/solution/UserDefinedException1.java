package com.jsp.solution;

import java.util.Scanner;
class invalidMobileNumException1  extends RuntimeException
{
	String msg;
	public invalidMobileNumException1()
	{
		msg="invalid";
	}
public	invalidMobileNumException1(String s)
	{
		super(s);
		msg=s;
	}
	public String  getMessage()
	{
		return msg;
	}
	
}
public class UserDefinedException1 {
public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println(" enter mobile number");
		String num=scn.next();
		System.out.println(num);
		if(num.length()==10)
		{
			System.out.println("valid");
		}
		else
		{
		try
		{
			throw new invalidMobileNumException1("not valid");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
}
}
