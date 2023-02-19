package com.jsp.basicstrings;
import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
	         String A=a.toLowerCase();
	         String B=b.toLowerCase();
	        
	        if(A.length()!=B.length())return false;
//	        System.out.println("----first-----");
	       while(A.length()>0)
	       {
	            char C1=A.charAt(0);
	            if(B.indexOf(C1+"")==-1)return false; 
//	            System.out.println("----second-----");
	            
	            String a1=A.replace(C1+"", "");
	            String b1=B.replace(C1+"", "");
	            int  count1=A.length()-a1.length();
	            int  count2=B.length()-b1.length();
	            if(count1!=count2)return false;
//	            System.out.println("----third-----");
	            A=a1;
	            B=b1;
//          System.out.println(A);
//         System.out.println(B);
	         }
	       return true;
	     }

	    public static void main(String[] args) {
	    	 Scanner scan = new Scanner(System.in);
	         String a = scan.next();
	         String b = scan.next();
	         scan.close();
	         boolean ret = isAnagram(a, b);
	         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	     }
	    }


