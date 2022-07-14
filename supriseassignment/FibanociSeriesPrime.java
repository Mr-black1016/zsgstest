package supriseassignment;

import java.util.Scanner;

public class FibanociSeriesPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the n:");
		int n = scanner.nextInt();
		int first = 0;
		int second = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = first + second;
			first = second;
			second = sum;
			// System.out.println(sum);
			int val = PrimeCheck(sum);
			if (val == sum)
				System.out.println(val);

		}
	}

	private static int PrimeCheck(int sum) {
		int flag = 0;
		for (int i = 2; i < sum / 2; i++) {
			flag = 0;
			if (sum % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			flag = sum;
		} else
			flag = 1;
		return flag;
	}
}
