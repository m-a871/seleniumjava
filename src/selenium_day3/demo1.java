package selenium_day3;
import java.util.*;
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		int total=(n1+n2+n3);
		System.out.println("total marks: " + total);
		int avg=((n1+n2+n3)/3);
		System.out.println("Average marks is: " + avg);
		if(avg>=60)
		{
			System.out.println("grade :Distinction");
		}
		
		else if(avg>40 && avg<60) {
		System.out.println("grade:pass");
		}
		
		else {
			System.out.println("grade:fail");}

	}

}
