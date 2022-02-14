package test;
import java.util.Scanner;
public class Switch4 {

	public static void main(String[] args) {
		System.out.println("1.area of circle");
		System.out.println("2.area of triangle");
		System.out.println("3.simple intrest");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("enter radius");
		int r=sc.nextInt();
		System.out.println("area of circle is"+3.14*r*r);
		break;
		case 2:
		System.out.println("enter ht and base");
		int h=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("area of triangle"+(h*b)/2);
		break;
		case 3:
		System.out.println("enter pn rate");
		int p=sc.nextInt();
		int n=sc.nextInt();
		int rate=sc.nextInt();
		System.out.println("simple intrest is"+(p*n*rate)/100);
		break;
		default:
		System.out.println("default");
		}	
	}
}
