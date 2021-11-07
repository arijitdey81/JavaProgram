package javaImportantPrograms;

import java.util.LinkedHashSet;

public class jp_02_DuplicateCharacterInString {

	public static void main(String[] args) {
		String s="TESTYANTRA";
		
		//Step1: Create set of collection & add all char given string into set
		LinkedHashSet<Character> linkedSet=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) 
		{
			linkedSet.add(s.charAt(i));
		}
		
		for(Character ch:linkedSet) {
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(ch+"   "+count);
		}

	}

}
