package javaImportantPrograms;

public class SeperateStringNumberSpecialChar {

	public static void main(String[] args) {
		String s="Wfgh@12D3$hShjbjA";
		String alpha="";
		String num="";
		String specialChar="";
		
		for(int i=0;i<s.length();i++) 
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') ||(s.charAt(i)>='a' && s.charAt(i)<='z'))
					{
						alpha=alpha+s.charAt(i);
					}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
					num=num+s.charAt(i);
			}
			else
			{
				specialChar=specialChar+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(specialChar);
		

	}

}
