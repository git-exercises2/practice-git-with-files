package java_basics;

import java.util.Scanner;

public class compute_square {

	int compute(int n) {
		int sq = n * n;
		return sq;
	}

public static void main(String[] args) {

		compute_square obj = new compute_square();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();

		num = obj.compute(num);
		System.out.println(num);

	}
}