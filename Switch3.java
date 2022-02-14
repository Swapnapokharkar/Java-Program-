package test;
import java.util.Scanner; 
public class Switch3 {

	public static void main(String[] args) {
		System.out.println("1.add 2.sub 3.mult 4.div");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two numbers and ur choice");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int choice=sc.nextInt();
		int res=0;
		System.out.println("number1 is"+a+"number2 is"+b+"choice is"+choice);
		switch(choice)
		{
		case 1:
		res=a+b;
		System.out.println("addition is"+res);
		break;
		case 2:
		res=a-b;
		System.out.println("sub is"+res);
		break;
		case 3:
		res=a*b;
		System.out.println("mult is"+res);
		break;
		case 4:
		res=a/b;
		System.out.println("div is"+res);
		break;
		default:
		System.out.println("invalid choice");
		}
		}
	}


