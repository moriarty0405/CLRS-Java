package C02;

public class MergeSort {
	public static void main(String[] argu) {
		int x[] = {5, 2, 4, 6, 1, 3};
		int len = 6;
		printArray(x, len);
		
		MergeSort(x, 0, len-1);
		printArray(x, len);
	}
	
	public static void printArray(int a[], int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void MergeSort(int a[], int start, int end) {
		if (start < end) {
			int size = end-start+1, mid;
			if (size % 2 == 0) {  
	            mid = start + size / 2 - 1;  
	        } else {  
	            mid = start + size / 2;  
	        }
			MergeSort(a, start, mid);
			MergeSort(a, mid+1, end);
			Merge(a, start, mid, end);
		}
	}
	
	public static void Merge(int a[], int start, int mid, int end) {
		int n1 = mid-start+1, n2 = end-mid;
		int[] t1 = new int[n1+1];
		int[] t2= new int[n2+1];
		
		for (int i = 0; i < n1; i++) {
			t1[i] = a[start+i];
		}
		t1[n1] = Integer.MAX_VALUE;
		for (int i = 0; i < n2; i++) {
			t2[i] = a[mid+1+i];
		}
		t2[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if (t1[i] <= t2[j]) {
				a[k] = t1[i];
				i++;
			} else {
				a[k] = t2[j];
				j++;
			}
		}
	}
}
