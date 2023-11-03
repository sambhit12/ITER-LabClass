import java.util.Scanner;

public class SelectionSort {
	
	public static void selection(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int minIdx = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[minIdx])    minIdx = j;
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64, 25, 22, 76, 23, 44, 11};
		print(arr);
		selection(arr);
		print(arr);
	}

}
