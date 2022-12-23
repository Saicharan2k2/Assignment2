package assignment4;
public class Max_char {
	static char max_char(String str)
	{
		int[] ch=new int[256];
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)]++;
		}
		int max=-1;
		char max_char=' ';
		for(int i=0;i<str.length();i++)
		{
			if(max<ch[str.charAt(i)])
			  {
			     max=ch[str.charAt(i)];
			     System.out.println(str.charAt(i));
				max_char=str.charAt(i);
			  }
		}
		return max_char;
	}
	public static void main(String[] args) {
		String str="sai charan";
		System.out.println("Max occuring character in "+str+" is : "+max_char(str));
	}
}