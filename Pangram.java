package assignment4;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		str=str.replaceAll(" ", "").toLowerCase();
		String str1="";
		for(char i='a';i<='z';i++)
		{
			if(str.indexOf(i)!= -1)
				str1+=i;
		}
		if(str1.length() ==26) 
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not a Pangram");
		}
		
	}

}
