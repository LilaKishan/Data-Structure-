import java.util.*;

class FactorialDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter factorial no.: ");
		int f =sc.nextInt();
		int ans=1;
		for (int i=1;i<=f ;i++ ) {
			ans= ans*i;
		}
		System.out.println("factorial is  "+ans);
	}
}