import java.util.Scanner;
public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter the size of the array you want to create : ");
		int length = obj1.nextInt();
		int Array[] = new int[length];
		for(int i = 0; i < length; i++) {
			System.out.print("Enter the elements of the Array : ");
			int element = obj1.nextInt();
			Array[i] = element;
		}
		for(int j : Array) {
			System.out.print(j + " ");
		}
		System.out.println();
		obj.Sort(Array);
		obj.printSort(Array);
	}
	public void Sort(int []Array) {
		int n = Array.length;
		for(int i = 1; i < n; i++) {
			int concurrent = Array[i];
			int j = i -1;
			while(j >= 0 && Array[j] > concurrent) {
				Array[j + 1] = Array[j];
				j--;
			}
			Array[j + 1] = concurrent;
		}
	}
	public void printSort(int [] Array) {
		int n = Array.length;
		for(int i : Array) {
			System.out.print(i + " ");
		}
	}
}
