package C02;

public class BinarySearch {
	public static void printArray(int a[], int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] argu) {
		int x[] = {1, 2, 3, 4, 5, 6};
		int len = 6;
		
		int target = 6;
		int pos = BinarySearch(x, len, target);
		if (pos >= 0)
			System.out.println("Target "+target+" is at "+ pos+" in the array.");
		else
			System.out.println("Target is not in the array.");
	}
	
	public static int BinarySearch(int a[], int len, int target) {
		int low = 0, high = len-1, mid = -1;
		
		while(low <= high) {
			mid = (low + high) >> 1;
			if (a[mid] == target)
				return mid;
			if (a[mid] > target)
				high = mid - 1;
			else 
				low = mid + 1;
		}
		
		return -1;
	}
}
