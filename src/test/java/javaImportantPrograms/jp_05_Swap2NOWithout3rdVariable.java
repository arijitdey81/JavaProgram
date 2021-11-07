package javaImportantPrograms;

import java.util.Scanner;

public class jp_05_Swap2NOWithout3rdVariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a & b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
