public class KeyIndex {
	public static void main(String[] args) {
		int a[] = {56,98,45,100,3,5,67,34,90};
		sort(a);
		printArray(a);
	}
	public static void sort(int a[]) {
		int N = a.length;
		int R = 255;
		//Compute the count frequency
		int count[] = new int[R + 1];
		for(int i = 0; i < N; i++) {
			count[a[i] + 1]++;
		}
		//Transform the count to indices
		for(int r = 0; r < R; r++) {
			count[r + 1] += count[r];
		}
		//Distribute the data 
		int aux[] = new int[R];
		for(int i = 0; i < N; i++) {
			aux[count[a[i]]++] = a[i];
		}
		//Copy the data
		for(int i = 0; i < N; i++) {
			a[i] = aux[i];
		}
	}
	public static void printArray(int a[]) {
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
