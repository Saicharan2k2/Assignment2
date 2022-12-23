package assignment2;
public class MergeSort {
		void merge(int arr[], int low, int mid, int high)
		{
			int n1 = mid - low + 1;
			int n2 = high - mid;
			int sub1[] = new int[n1];
			int sub2[] = new int[n2];
			for (int i = 0; i < n1; i++)
				sub1[i] = arr[low + i];
			for (int j = 0; j < n2; j++)
				sub2[j] = arr[mid + 1 + j];
			int i = 0, j = 0;
			int k = low;
			while (i < n1 && j < n2) {
				if (sub1[i] <= sub2[j]) {
					arr[k] = sub1[i];
					i++;
				}
				else {
					arr[k] = sub2[j];
					j++;
				}
				k++;
			}
			while (i < n1) {
				arr[k] = sub1[i];
				i++;
				k++;
			}
			while (j < n2) {
				arr[k] = sub2[j];
				j++;
				k++;
			}
		}
		void sort(int arr[], int low, int high)
		{
			if (low < high) {
				int mid = (high + low) / 2;
				sort(arr, low, mid);
				sort(arr, mid + 1, high);
				merge(arr, low, mid, high);
			}
		}
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.println(arr[i] + " ");
		}
		public static void main(String args[])
		{
			int arr[] = { 12, 111, 103, 5, 68, 7 };
			System.out.println("Before sorting Array is:");
			printArray(arr);
			MergeSort obj = new MergeSort();
			obj.sort(arr, 0, arr.length - 1);
			System.out.println("Sorted array is :");
			printArray(arr);
		}
	}
