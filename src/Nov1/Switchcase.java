package Nov1;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter course name");
			String course = S.next();
			switch(course.toUpperCase()) {
			case "SELENIUM":
					System.out.println("course is Available  "+course);
				break;
				case "QTP":
					System.out.println("course is Available   "+course);
				break;
				case "MANUAL":
					System.out.println("course is Available   "+course);
				break;
			default:
				System.out.println("course is notAvailable   "+course);
				break;

			}
		}
	}

}