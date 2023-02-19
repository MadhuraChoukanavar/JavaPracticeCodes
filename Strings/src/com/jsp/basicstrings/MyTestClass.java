package com.jsp.basicstrings;
	
  public class MyTestClass {
		    public static void  main (String args[])
		    {

		        String input ="I Like Java Programming";
		        String[] split = input.split("\\s+");
		        String output="";
		        for(int i =0 ; i<split.length;i++)
		        {
		            output=output +  reverseString(split[i]);
		            if(i!= split.length)
		            {
		                output=output+" ";
		            }
		        }

		        System.out.println("output= "+ output);
		    }


		    public static String reverseString(String s)
		    {
		        String reversed="";
		        for(int j=s.length();j>0;--j)
		        {
		            reversed=reversed+(s.charAt(j-1));
		        }
		        return reversed;
		    }
		 
		}

