import java.util.Scanner;
public class StudentDetails
{
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        double subject1 = sc.nextDouble();
        double subject2 = sc.nextDouble();
        double subject3 = sc.nextDouble();
        Student s = new Student(name, rollno, subject1, subject2, subject3);
	}
}
class Student{
	String name;
	int rollno;
	double subject1, subject2, subject3;

	public Student(String name,int rollno, double subj1, double subj2, double subj3)
	{
		this.name = name;
		this.rollno = rollno;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		System.out.println((subj1 + subj2 + subj3)/3);
	}
}