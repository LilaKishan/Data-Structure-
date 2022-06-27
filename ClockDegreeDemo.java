import java.util.Scanner;
public class ClockDegreeDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours : ");
		int hour = sc.nextInt();
		System.out.print("Enter minutes : ");
		int min = sc.nextInt();

		if(hour==12)
			hour=0;
		if(min==60)
			min=0;

		int hourangle;
		int minangle;

		hourangle= (hour * 30)  + (min / 2);
		minangle= (min * 6);

		int angle;
		angle=Math.abs(hourangle-minangle);

		System.out.println("Angle is : "+angle+" degree");
	}
}