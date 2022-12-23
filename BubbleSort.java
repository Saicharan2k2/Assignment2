package assignment2;
public class BubbleSort {
	static void sort() {
	int a[]={10,2,56,3,6,1,99,78};
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<a.length-i;j++)
		{
			if(a[j-1]>a[j])
			{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	for(int ele:a)
	{
		System.out.println(ele);
	}
	}
	public static void main(String[] args) {
	sort();
	}
}
