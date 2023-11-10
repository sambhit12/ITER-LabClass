
public class PairWithMinimumDifference_A2 {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void Insertion(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 6, 4, 19, 17, 20};
		int n = arr.length;
		print(arr);
		int diff = arr[1] - arr[0];
		for(int i = 2; i < n; i++) {
			if(Math.abs(arr[i] - arr[i-1]) < diff) {
				diff = Math.abs(arr[i] - arr[i-1]);
			}
		}
		System.out.println(diff);
	}
}
