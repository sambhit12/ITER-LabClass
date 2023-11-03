import java.util.Scanner;

public class Fibonacci_Iterative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci Series will be : "+a+" ");
		System.out.print(b+" ");
		for(int i = 0; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}
}
