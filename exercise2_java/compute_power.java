package java_basics;
import java.lang.Math;
import java.util.Scanner;


public class compute_power {
		int compute(int num, int exp) {
		int res = (int) Math.pow(num, exp);
		return res;
	}
		
		public static void main(String[] args){
			
			compute_power pow = new compute_power();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int numA = sc.nextInt();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter exponent: ");
			int numB = sc.nextInt();
			
			
			int result = pow.compute(numA, numB);
			System.out.print("Result is: " + result);
			
		}

}