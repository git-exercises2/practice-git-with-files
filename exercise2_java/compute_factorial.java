package java_basics;

import java.util.Scanner;

public class compute_factorial {

	int compute(int n) {

		int fc = 1;
		for (int i = 1; i <= n; i++) {
			fc = fc * i;
		}

		return fc;

	}

	public static void main(String[] args) {

		compute_factorial obj = new compute_factorial();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();

		num = obj.compute(num);
		System.out.println(num);

	}
}
