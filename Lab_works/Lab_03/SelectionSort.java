import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter the size of the array you want to create : ");
		int length = obj1.nextInt();
		int Array[] = new int[length];
		for(int i = 0; i < length; i++) {
			System.out.print("Enter the elements of the Array : ");
			int element = obj1.nextInt();
			Array[i] = element;
		}
		System.out.println("Unsorted Elements ");
		for(int j : Array) {
			System.out.print(j + " ");
		}
		System.out.println();
		obj.Sort(Array);
		obj.printSort(Array);
	}
	public void Sort(int []Array) {
		int n = Array.length;
		int compcount = 0;
		int swaps = 0;
		for(int i = 0; i < n - 1; i++) {
			int minValue = i;
			for(int j = i + 1; j < n; j++) {
				compcount++;
				if(Array[j] < Array[minValue]) {
					minValue = j;
				}
			}
			int temp = Array[minValue];
			Array[minValue] = Array[i];
			Array[i] = temp;
			swaps++;
		}
		System.out.println("Compcount : " +compcount);
		System.out.println("Swapscount : " +swaps);
	}
	public void printSort(int [] Array) {
		int n = Array.length;
		System.out.println("Sorted Elements ");
		for(int i : Array) {
			System.out.print(i + " ");
		}
	}
}
