public class linearSearch {
	public static void main(String[] args) {
		int a[] = {34,56,78,23,12,45,67,89};
		System.out.print("Elements : ");
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		linear(a);
	}
	public static void linear(int a[]) {
		int target = 78;
		for(int i = 0; i < a.length; i++) {
			if(target == a[i]) {
				System.out.println("The target element "+ target + " is found at index : "+ i);
			}
			else {
				System.out.println("The target element is not found");
			}
		}
	}
}
