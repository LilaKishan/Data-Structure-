/*7. Write a program to swap two numbers using user-defines method.*/

import java.util.Scanner;
public class SwapDemo{
	public static void swapNumbers(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping----");
		System.out.println("1st number : "+a);
		System.out.println("2nd number : "+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();

		SwapDemo s = new SwapDemo();
		s.swapNumbers(a,b);
	}
}