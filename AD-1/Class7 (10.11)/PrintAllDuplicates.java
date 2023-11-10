public class PrintAllDuplicates {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] printDuplicates(int[] arr) {
		int n = arr.length;
		int[] dup = new int[2];
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n-1; j++) {
				if(arr[i] == arr[j]) {
					dup[i] = arr[i];
					continue;
				}
			}
		}
		return dup;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 3, 9, 1, 30};
		print(arr);
		int[] ans = printDuplicates(arr);
		print(ans);
	}
}
