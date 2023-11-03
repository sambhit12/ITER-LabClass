// Question : From the Sorted array rearrange the array in min-max form ...
// Input : {1, 2, 3, 4, 5, 6, 7}
// Output : {7, 1, 6, 2, 5, 3, 4}

import java.util.Scanner;

public class Q7_MaxMin {
	
	public static int[] maxMin(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				temp[i] = arr[end];
				end--;
			} else {
				temp[i] = arr[start];
				start++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int[] res = maxMin(arr);
		System.out.println("Rearranging Array is : ");
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	} 
}
