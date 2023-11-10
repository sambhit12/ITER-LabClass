public class PairWithMinDifference {

	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void minDiff(int[] arr) {
		int ans = 0;
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				ans = Math.abs(arr[j]-arr[i]);
				if(ans < min) {
					min = ans;
				}
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 6, 17, 23, 10, 20};
		print(arr);
		minDiff(arr);
	}
}
