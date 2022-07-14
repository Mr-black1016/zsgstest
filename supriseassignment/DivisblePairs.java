package supriseassignment;

import java.util.Scanner;

public class DivisblePairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the n :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		// input 1 2 3 4 5 6 k=5
		System.out.println("enter the k :");
		int k = scanner.nextInt();
		System.out.println("Enter the array Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum = arr[i] + arr[j];
				if (sum % k == 0) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}

}
