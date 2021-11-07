package javaImportantPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class jp_01_OccuranceNoEachCharacter {

	public static void main(String[] args) {
		String s="INDIA";
		
		//Step1: Create set of collection & add all char given string into set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		//Step2: Compare each char of set with all char of given String
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//Step3: Print both char of set & count of string
			System.out.println(ch+"   "+count);
			
		}
		

	}

}
