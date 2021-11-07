package javaImportantPrograms;

import java.util.LinkedHashSet;

public class jp_09_UniqueWords {

	public static void main(String[] args) {
		String s="Welcome To TYSS Welcome To Bangalore";
		String[] str=s.split(" ");
		
		//Step1: create any set collection and add string array values into set
		LinkedHashSet<String> linkSet=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			linkSet.add(str[i]);
		}
		//Step2: compare each value of set with all the value of String array
		for(String word:linkSet)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
				count++;
				}
			}
			if(count==1)
			//Step3: print both words and count
			System.out.print(word+" ");
			
		}

	}

}
