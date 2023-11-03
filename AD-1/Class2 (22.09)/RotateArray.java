import java.util.Scanner;

public class RotateArray {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverse(int[] arr, int i, int j) {
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		int i = 0;
		int j = arr.length-1;
		reverse(arr, i, k-1);
		reverse(arr, k, n-1);
		reverse(arr, i, j);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		print(arr);
		System.out.println("Rotate Array : ");
		rotate(arr,2);
		print(arr);
	}
}
