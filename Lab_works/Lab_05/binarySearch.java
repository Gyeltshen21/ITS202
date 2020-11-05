public class binarySearch {

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int a[] = {56,98,45,100,3,5,67,34,90};
		obj.sort(a);
		printArray(a);
		binary(a, 0, a.length - 1);
	}
	public static void printArray(int a[]) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void binary(int a[], int lo, int hi) {
		int target = 45;
		int mid = (lo + hi)/2;
		while(lo <= hi) {
			if(a[mid] < target) {
				lo = mid + 1;
			}
			else if(a[mid] == target) {
				System.out.println("The target " + target + " element is found at index : " + mid);
				break;
			}
			else {
				hi = mid - 1;
			}
			mid = (lo + hi)/2;
		}
		if(lo > hi) {
			System.out.println();
		}
	}
}
