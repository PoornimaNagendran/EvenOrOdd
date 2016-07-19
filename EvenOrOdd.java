package Guvi;
import java.util.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a;
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("The given number is odd");
		}

	}

}
