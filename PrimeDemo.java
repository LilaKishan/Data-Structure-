import java.util.*;

class PrimeDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  no.: ");
		int f =sc.nextInt();
		int ans=1;
		for (int i=2;i<=f/2 ;i++ ) {
			if (f%i==0) {
				ans=0;
			}
		}
		if (ans==1) {
			System.out.println("Prime no.");
		}
		else
			System.out.println("not Prime no.");
	}
}