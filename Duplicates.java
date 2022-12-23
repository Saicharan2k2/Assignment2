package assignment4;
public class Duplicates {
	public static void main(String[] args) {
		String str="sai kiran";
		char []ar=str.toCharArray();
		System.out.println("Given string is:"+str);
		System.out.println("Duplicates in string are:");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
					break;
				}
			}
		}
	}

}
