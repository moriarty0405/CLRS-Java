package C02;

public class Inversion {
	public static int count;
	
	public static void main(String[] argu) {
		int x[] = {5, 2, 4, 6, 1, 3};
		int len = 6;
		count = 0;
		
		printArray(x, len);
		
		MergeSort(x, 0, len-1);
		System.out.println("The total number of inversions is: " + count);
		//printArray(x, len);
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
			MergeCount(a, start, mid, end);
			System.out.println();
		}
	}
	
	public static void MergeCount(int a[], int start, int mid, int end) {
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
				
				// count inversions
				count += n1 - i;
				for (int x = i; x < n1; x++) {
					// if t1[i] < t2[j], as t1[0...i) < t2[j] and t1[0...j) < t2[j]
					// then t1[i...n1) and t2[j] are inversions
					System.out.print("<"+t1[x]+","+t2[j-1]+"> ");
				}
			}
		}
	}
}
