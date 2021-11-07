package javaImportantPrograms;

import java.util.Scanner;

public class jp_13_ReverseWithoutLengthMethod {

	public static void main(String[] args) {
		
		String s="ARIJITTYSS";
		char[] a = s.toCharArray();
		int count=0;
		String rev="";
		for(char ch:a)
		{
			count ++;
		}
		
		for(int i=count-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			//System.out.println(a);
			
			
		}
		
		System.out.println(rev);
	}

}
