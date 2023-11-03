import java.util.Scanner;

public class Fibonacci_Recursive {
	public static int fibonacci(int n) {
		int ans = 1;
		if(n == 0 || n == 1)  {
			System.out.println(n);
			return n;
		}
		for(int i = 1; i <= n; i++) {
			ans = fibonacci(n-1) + fibonacci(n-2);
			System.out.println(ans);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("Fibonacci Series will be : "+fibonacci(n));
	}
}
