package assignment4;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int vowels=0,consonants=0,special_chars=0,numbers=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='u')
				++vowels;
			else if(ch>='a' && ch<='z')
				++consonants;
			else if(ch>='0' && ch<='9')
				++numbers;
			else
				++special_chars;
		}
		System.out.println("no of vowels : "+vowels);
		System.out.println("no of consonants : "+consonants);
		System.out.println("no of numbers : " +numbers);
		System.out.println("no of special characters : "+special_chars);
	}

}
