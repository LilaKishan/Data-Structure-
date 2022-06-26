/*4. Read n numbers in an array then read two different numbers,
replace 1st number with 2nd number in an array and print its index and final array.*/

import java.util.Scanner;

public class ArrayDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean no= true;
		System.out.print("enter size of array: ");
		n=sc.nextInt();
		int a[] =new int[n];

		for (int i=0;i<n ;i++ ) {
			System.out.print("element of array :");
			a[i]=sc.nextInt();
		}
		System.out.print("enter 1st number :");
		int first_no = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int second_no = sc.nextInt();

		System.out.println("--------------------------");

		for (int j=0;j<n ;j++) {
			if (first_no==a[j]) {
				a[j]=second_no;
				no = false;
				System.out.println("repalce at index : "+j);
			}
		}
		if (no==true) {
			System.out.println("invalid input of numbers...!!!");
		}
		System.out.println("--------------------------");
		System.out.println("final array:");
		for (int k=0;k<n ;k++) {
			System.out.println("elements are "+a[k]);
		}

	}
}