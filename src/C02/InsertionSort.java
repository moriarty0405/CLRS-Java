package C02;

// Implemention of insertion sort
public class InsertionSort {
	public static int[] InsertionSort(int a[], int length, int type) {
		// non-decreasing order
		if (type == 1) { 
			for (int i = 1; i < length; i++) {
				int key = a[i];
				
				// Insert key into the sorted part array
				int j = i-1;
				while(j >= 0 && a[j] > key) {
					// Exchange position
					a[j+1]=a[j];
					j--;
				}
				// Find the index of last postion
				a[j+1] = key;
			}
		}
		
		// non-increasing order
		if (type == 2) { 
			for (int i = 1; i < length; i++) {
				int key = a[i];
				
				// Insert key into the sorted part array
				int j = i-1;
				while(j >= 0 && a[j] < key) {
					// Exchange position
					a[j+1]=a[j];
					j--;
				}
				// Find the index of last postion
				a[j+1] = key;
			}
		}
		
		return a;
	}
	
	public static void printArray(int a[], int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] argu) {
		int x[] = {5, 2, 4, 6, 1, 3};
		int len = 6;
		printArray(x, len);
		
		// Sort type: 1: non-decreasing order; 2: non-increasing order
		int type = 1;
		
		int new_x[] = InsertionSort(x, len, type);
		printArray(new_x, len);
	}

}
