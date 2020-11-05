public class LSD {
	public static void main(String[] args) {
		String a[] = {"DORJI","SONAM","JIGME","KARMA","LHAMO"};
		//W is number charc in each words
		int W = 5;
		System.out.println("Unsorted");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		sort(a, W);
		printArray(a);
	}
	public static void sort(String a[], int W) {
		int R = 255;
		int N = a.length;
		String aux[] = new String[R + 1];
		// Sort by key-indexed counting on dth char.
		for(int d = W - 1; d >= 0; d--) {
			//compute the count frequency 
			int count[] = new int[R + 1];
			for(int i = 0; i < N; i++) {
				count[a[i].charAt(d) + 1]++;
			}
			//transform the count to indices
			for(int r = 0; r < R; r++) {
				count[r + 1] += count[r];
			}
			//Distribute the data
			for(int i = 0; i < N; i++) {
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			//Copy the data
			for(int i = 0; i < N; i++) {
				a[i] = aux[i];
			}
		}
	}
	public static void printArray(String a[]) {
		System.out.println("Sorted ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
