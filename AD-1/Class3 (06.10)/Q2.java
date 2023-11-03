// Question : Maximum of a Number ...

import java.util.Scanner;

public class Q2 {
	
	public static int maximum(int[] arr, int n) {
		if(n == 1) return arr[0];
		int max = arr[n-1];
		int ans = maximum(arr, n-1);
		return Math.max(max, ans);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {4,7,1,3,2};
		System.out.println("Maximum is : "+maximum(arr, arr.length));
	}
}
