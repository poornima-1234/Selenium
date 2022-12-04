package Nov1;

import java.util.Scanner;

public class Conditional {
	public static void main (String[] args) {
		Scanner S= new Scanner (System.in);

		for(int i=1;i<=5;i++) {
			System.out.println("enter marks");
			int marks= S.nextInt();
			if (marks>=35) {
				System.out.println("pass  "+marks);
			}
			else
			{
				System.out.println("fail   "+marks);
			}
		}

	}
}
