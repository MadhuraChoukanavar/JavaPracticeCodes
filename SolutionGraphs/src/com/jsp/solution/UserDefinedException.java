package com.jsp.solution;

import java.util.Scanner;

class invalidMobileNum extends RuntimeException
{
	String msg;
	invalidMobileNum(String num)
	{
		msg="number isnot having 10 digits "+num;
	}
	public String getMessage()
	{
		
		//System.out.println(msg);
		return msg;
	}
}
public class UserDefinedException {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println(" enter mobile number");
	String num=scn.next();
	System.out.println(num);
	if(num.length()<10||num.length()>10)
	{
		throw new invalidMobileNum(num);
	}
	System.out.println("number is valid");
	}
  }
