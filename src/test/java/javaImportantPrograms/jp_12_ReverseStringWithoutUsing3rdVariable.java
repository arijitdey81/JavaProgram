package javaImportantPrograms;

public class jp_12_ReverseStringWithoutUsing3rdVariable {

	public static void main(String[] args) {
		
		String s="ARIJIT";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
