import java.util.*;

class Factorial{
	public int recursion(int n){
		if (n==1) {
			return 1;
		}
		else
		{
			return (n*recursion(n-1));
		}
	}	
}
class FactorialUsingRecursion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. ");
		int i=sc.nextInt();
		Factorial f =new Factorial();
		int ans=f.recursion(i);
		System.out.println("answer of Factorial "+ans);
	}
}