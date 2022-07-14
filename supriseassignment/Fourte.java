package supriseassignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Fourte {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(); 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to fourte");
		System.out.println();
		System.out.println("enter the target num : ");
		int target = scanner.nextInt();
		System.out.println("Target num is : " + target);
		System.out.println("enter the n valid nums");
		int n = scanner.nextInt();
		int nums = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			nums = scanner.nextInt();
			arrayList.add(nums);
		}
		System.out.println("must use below numbers");
		
		while (arrayList.size() > 0) {
			System.out.println(" to sum all this nums to get the target");
			int select = scanner.nextInt();
			System.out.println(arrayList);
			if(arrayList.contains(select)) {
				System.out.println(" (+ - * /)");
				System.out.println("43 : + ");
				System.out.println("45 : - ");
				System.out.println("42 : * ");
				System.out.println("47 : / ");
				System.out.println("40 : ( ");
				System.out.println("41 : ) ");
				System.out.println();
				int symbol = scanner.nextInt();
				if( 43 == symbol) {
				sum = sum + select;
				arrayList.remove(select);
				}
				else if(45 == symbol) {
					sum = sum - select;
					arrayList.remove(select);
				}
				else if(42 == symbol) {
					sum = sum * select;
					arrayList.remove(select);
				}
				else if(47 == symbol) {
					sum = sum/ select;
					arrayList.remove(select);
				}
				
			}
			else {
				System.out.println("invalid number");
			}
		}

	}
}