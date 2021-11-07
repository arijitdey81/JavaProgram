package javaImportantPrograms;

import java.util.LinkedHashSet;

public class jp_03_UniqueCharacterInString {

	public static void main(String[] args) {
		String s="TESTYANTRA";
		
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
			if(count==1)
				System.out.print(ch);
		}


	}

}
