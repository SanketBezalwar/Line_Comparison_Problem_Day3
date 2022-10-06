package Line_Comparison_Problem;

import java.util.Scanner;

public class Line_Comparison {
	public static double line1;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison");
		System.out.println();

		Line_Comparison l1 = new Line_Comparison();

		l1.lengthOfLine1();
	}

	// calculate length of line1
	public void lengthOfLine1() {
		int x1, y1;
		int x2, y2;

		Scanner sc = new Scanner(System.in);
		System.out.println("To Calculate Length of Line 1 ");
		System.out.print("Enter the value of x1 : ");
		x1 = sc.nextInt();
		System.out.print("Enter the value of y1 : ");
		y1 = sc.nextInt();
		System.out.print("Enter the value of x2 : ");
		x2 = sc.nextInt();
		System.out.print("Enter the value of y2 : ");
		y2 = sc.nextInt();

		line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println();
		System.out.println("Result :");
		System.out.println("Length of Line1 with co-ordinates (x1,y1),(" + x1 + "," + y1 + ") and (x2,y2),(" + x2 + "," + y2 + ") = " + line1);
		System.out.println();

	}

}
