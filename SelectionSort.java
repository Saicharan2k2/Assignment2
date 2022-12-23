package assignment2;
public class SelectionSort {
	static void sort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int pointer=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[pointer])
				{
					pointer=j;
				}
			}
			int small=a[pointer];
			a[pointer]=a[i];
			a[i]=small;
		}
	}
		static void printArray(int a[])
		{
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {
	int a[]= {3,40,1,5,2,11,-10,32};
	System.out.println("Initial Array elements:");
	printArray(a);
	sort(a);
	System.out.println("After sorting elements :");
	printArray(a);
	}
}
