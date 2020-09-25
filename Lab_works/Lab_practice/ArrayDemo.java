
public class ArrayDemo {

	public static void main(String[] args) {
		//Values already stored in Array
		int Array[] = {1,2,3,4};
		for(int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]);
		}
		System.out.println(" ");
		// Creating new Array
		int array[] = new int[4];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		for(int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}
	}
}
