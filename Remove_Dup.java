package assignment4;
public class Remove_Dup {
	static void remove(String str)
	{
		String str1=new String();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str1.indexOf(ch)<0)
				str1+=ch;
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		String str="sai charan";
		remove(str);
	}
}
