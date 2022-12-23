package assignment4;
public class Palindrome {
	public static void main(String[] args) {
		int n=121;
		int rem=0,sum=0,temp=0;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
