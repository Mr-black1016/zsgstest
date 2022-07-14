package supriseassignment;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public static void main(String[] args) {
		// lower case 97 
		// uppercase 65
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the given String: ");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		System.out.println();
	
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
    		if(a[i]>='A' && a[i]<='Z')
    		{ 
    			a[i]=(char)((int)a[i]+32);
    		}
		}
		char b[]=s1.toCharArray();
		for(int i=0;i<b.length;i++)
		{
    		if(b[i]>='A' && b[i]<='Z')
    		{ 
    			b[i]=(char)((int)b[i]+32);
    		}
		}
		sort(a);
		sort(b);
		boolean result = Arrays.equals(a, b);
		if (result == true) {
			System.out.println("given string is anagram");
		} else {
			System.out.println("given String is not anagram");
		}
	}

	private static void sort(char[] a) {
		// TODO Auto-generated method stub
		char temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
	}
}
