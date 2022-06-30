import java.util.Scanner;
class DigitDemo{
	public static int no_of_digit(int a){
		if (a==0) {
			return 0;
		}
		else{
			return 1+no_of_digit(a/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println(no_of_digit(a));
	}
}