
public class LargestSumContiguousSubarray {
	public static int maxSubArr(int[] arr) {
		int MaxSum = 0;
		int CurrSum = 0;
		for(int i = 0; i < arr.length; i++) {
			CurrSum += arr[i];
			MaxSum = Math.max(MaxSum, CurrSum);
			if(CurrSum < 0) CurrSum = 0;
		}
		return MaxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {-5, 8, 9, -6, 10, -15, 3};
		System.out.println(maxSubArr(arr));
	}
	
	
}
