package com.jsp.solution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidMobileNumber extends RuntimeException {
	String msg;

	InvalidMobileNumber(String num) {
		//msg = "Starting num is invalid" + "";
		if(num.length() !=10)
		{
			msg="length not equal to 10";
		}
		if(!(num.charAt(0)>='6' && num.charAt(0)<='9'))
		{
			if(num.length()!=10)
			{
			msg+="\nNot String with Valid Number 6 -9 ";
			}
			else
			{
			msg="Not String with Valid Number 6 -9 ";
			}
		}

	}
	
	public String getMessage() {
		return msg;
	}
}

public class CheckFistDigitOfNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		// String num=scn.next();
		 String num="7345678199";
		 if(num.length() !=10 || !(num.charAt(0)>='6' && num.charAt(0)<='9'))
				 {
			 		throw new InvalidMobileNumber(num);
				 }
		
		 System.out.println("Valid");
		 
		 
		
	}

}



//String num = "7789123463";
//String exp = "[6-9][0-9]{0,9}";
//
//Pattern p = Pattern.compile(num);
//Matcher m = p.matcher(exp);
//// System.out.println(num + " "+num.length());
//
//if (!m.matches()) {
//	throw new InvalidMobileNumber();
//} else {
//	System.out.println("valid number");
//}

