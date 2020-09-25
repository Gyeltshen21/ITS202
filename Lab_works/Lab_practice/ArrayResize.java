public class ArrayResize {
	static int array[];
	//Method for new array 
	public static int[] resize(int length) {
		int temp[] = new int[length];
		for(int i = 0; i < array.length;i++) {
			temp[i] = array[i];
		}
		temp[length - 1] = 4;
		array = temp;
		return array;
	}
	
	public static void main(String[] args) {
		//Array storing
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		int newArr[] = resize(4);//Object creating for new array size
		for(int j = 0; j < newArr.length; j++) {
			System.out.print(" " +newArr[j]);
		}
	}
}
