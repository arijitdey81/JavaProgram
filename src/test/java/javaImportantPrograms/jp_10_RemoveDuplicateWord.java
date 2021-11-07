package javaImportantPrograms;

import java.util.LinkedHashSet;

public class jp_10_RemoveDuplicateWord {

	public static void main(String[] args) {
		String s="Welcome To TYSS Welcome To Bangalore";
		String[] str=s.split(" ");
		
		//Step1: create any set collection and add string array values into set
		LinkedHashSet<String> linkSet=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			linkSet.add(str[i]);
		}
		
		for(String word:linkSet)
		{
			System.out.print(word+" ");
		}

	}

}
