// Question : Sum of N Numbers ...

import java.util.Scanner;

public class Q1 {
	
	public static int sumN_Numbers(int n) {
		if(n == 0) return 0;
		return n + sumN_Numbers(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("Sum of Numbers is : "+sumN_Numbers(n));
	}
}
