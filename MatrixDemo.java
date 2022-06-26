/*5. Read two 2x2 matrices and perform addition of matrices into third matrix and print it.*/

import java.util.Scanner;

public class MatrixDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++) {
				System.out.println("enter no in row of :"+i+" and column : "+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("another matrix :---------------");
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++) {
				System.out.println("enter no in row of :"+i+" and column : "+j);
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("-------addition of 2 matrix-----------");

		for (int i=0;i<2 ;i++){
			for (int j=0;j<2 ;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println("");
		}
	}
}