/*9. Create array of object of class Student_Detail with attributes 
Enrollment_no, Name, Sem, CPI for 5 students,
scan their information and print it.*/

import java.util.Scanner;
class Student_Detail{
	long enrollment_no;
	String name;
	int sem;
	double cpi;

	Scanner sc = new Scanner(System.in);
	void getDetail(){
		System.out.println("-----Student_Detail-----");
		System.out.print("enter enrollment_no: ");
		enrollment_no=sc.nextLong();
		System.out.print("enter name: ");
		name=sc.next();
		System.out.print("enter sem : ");
		sem=sc.nextInt();
		System.out.print("enter cpi: ");
		cpi=sc.nextDouble();

	}

	void display(){
		System.out.println("------entered Detail-----");
		System.out.println("enrollment_no: "+enrollment_no);
		System.out.println("name: "+name);
		System.out.println("sem: "+sem);
		System.out.println("cpi: "+cpi);
	}
}

public class StudentArrayDemo{
	public static void main(String[] args) {
		Student_Detail student[]= new Student_Detail[5];

		for (int i=0;i<5 ;i++) {
			student[i]=new Student_Detail();
			student[i].getDetail();
			student[i].display();
		}
	}
}