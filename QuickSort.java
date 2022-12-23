package assignment2;
public class QuickSort {
	static void swap(int a[],int i,int j)
	{
		int tempVar=a[i];
		a[i]=a[j];
		a[j]=tempVar;
	}
	static int partition(int a[],int low,int high)
	{
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,high);
		return i+1;
	}
	static void quickSort(int a[],int low,int high)
	{
		if(low<high) {
			int pivot=partition(a,low,high);
			partition(a,low,pivot-1);
			partition(a,pivot+1,high);
		}
	}
	static void printArray(int a[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public static void main(String[] args) {
		int a[]= {13,18,56,16,25,27};
		int n=a.length;
		int low=0;int high=n-1;
		System.out.println("Before sorting Array is :");
		printArray(a,n);
		quickSort(a,low,high);
		System.out.println("After sorting Array is:");
		printArray(a,n);
		}
	}