package scannerclass;

import java.util.Scanner;

public class sc1 {
	
		public static void main(String[] args) {
			int a;
			int b;
			int c;
			System.out.println("Enter a values");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			
			System.out.println("Enter b values");
			b=sc.nextInt();
			
			c=a+b;
			System.out.println("addition is= " +c);
			
		}

}
