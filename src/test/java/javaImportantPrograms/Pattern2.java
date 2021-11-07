package javaImportantPrograms;

public class Pattern2 {

	public static void main(String[] args) {
		String s="ARIJIT";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
			System.out.println(res);
		}


	}

}
