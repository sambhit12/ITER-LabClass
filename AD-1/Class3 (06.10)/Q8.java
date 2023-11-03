// Question : Smallest Positive Missing Number ...

public class Q8 {
	
	public static int smallestMissing(int[] arr) {
		int n = arr[arr.length-1];
	
		for(int i = 1; i < n+1; i++) {
			int flag = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == i) {
					flag = 1;
					break;
				}
				if(flag == 0) return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {-3, 1, 4, 2, 7};
		System.out.println(smallestMissing(arr));
	}
}
