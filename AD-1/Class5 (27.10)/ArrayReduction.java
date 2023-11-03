
public class ArrayReduction {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n-i; j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void arrayReduction(int[] arr) {
		sort(arr);
		int n = arr.length;
		int count = 1;
		int reduction = arr[0];
		for(int i = 0; i < n; i++) {
			if(arr[i]-reduction > 0) {
				System.out.println(n-i);
				reduction = arr[i];
				count++;
			}
		}
		System.out.println("Total count of Array Reduction: "+count);
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 1, 1, 2, 3, 5};
		print(arr);
		arrayReduction(arr);
	}
}
