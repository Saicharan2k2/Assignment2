package assignment4;
public class Unique_chars {
	static boolean unique_chars(String str)
	{
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))
					return false;
			return true;
	}
	
	public static void main(String[] args) {
		String str="abcdefgh";
		if(unique_chars(str))
			System.out.println("String contains all Unique characters");
		else
			System.out.println("String contains duplicate characters");
	}

}
