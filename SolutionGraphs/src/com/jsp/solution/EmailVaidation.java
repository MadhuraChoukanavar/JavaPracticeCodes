package com.jsp.solution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidMailException extends RuntimeException
{
	String msg;
	InvalidMailException()
	{
		msg="Some issue";
		
	}
	public String getMessage()
	{
		return msg;
	}
	}


public class EmailVaidation {
	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("enter the mail");
		//String mail=scn.next();
		String mail="madhuragmail.com";
		String exp="[a-zA-Z][a-zA-Z0-9]*[@][a-zA-Z0-9]+[.]com";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(mail);
		if(!m.matches())
		{
		   throw new InvalidMailException();
		}
		else 
		{
			System.out.println("valid mail");
			}
		}

}
