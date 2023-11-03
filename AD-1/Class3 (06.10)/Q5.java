// Question : Power of a Number ...

import java.util.Scanner;

public class Q5 {
	
	public static int power(int x, int n) {
		if(n == 0) return 1;
		return x * power(x, n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int x = sc.nextInt();
		System.out.println("Enter the Power : ");
		int n = sc.nextInt();
		System.out.println("Power of Numbers is : "+power(x, n));
	}
}
