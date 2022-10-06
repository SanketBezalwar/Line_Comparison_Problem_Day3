package Line_Comparison_Problem;

import java.util.Objects;
import java.util.Scanner;

public class Line_Comparison {
	public static double line1;
	public static double line2;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison");
		System.out.println();

		Line_Comparison l1 = new Line_Comparison();

		l1.lengthOfLine1();
		l1.lengthOfLine2();
		l1.lengthEquality();
		l1.lineCompare();
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

	// calculate length of line2
	public void lengthOfLine2() {
		int a1, b1;
		int a2, b2;

		Scanner sc = new Scanner(System.in);
		System.out.println("To Calculate Length of Line 2 ");
		System.out.print("Enter the value of a1 : ");
		a1 = sc.nextInt();
		System.out.print("Enter the value of b1 : ");
		b1 = sc.nextInt();
		System.out.print("Enter the value of a2 : ");
		a2 = sc.nextInt();
		System.out.print("Enter the value of b2 : ");
		b2 = sc.nextInt();

		line2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println();
		System.out.println("Result :");
		System.out.println("Length of Line2 with co-ordinates (a1,b1),(" + a1 + "," + b1 + ") and (a2,b2),(" + a2 + "," + b2 + ") is " + line2);
		System.out.println();

	}

	// check equality of two lines
	public void lengthEquality() {
		System.out.println("Equality Result : ");
		boolean isEquals = Objects.equals(line1, line2);
		if (isEquals)
			System.out.println("The two Lines are Equal");
		else
			System.out.println("The two Lines are not Equal");
		System.out.println();
	}

	// comparing two lines
	public void lineCompare() {
		System.out.println("Comparison Result : ");
		if (line1 > line2)
			System.out.println("Line1 is Greater than Line2");
		else if (line1 == line2)
			System.out.println("Both the Lines are Equal");
		else
			System.out.println("Line2 is Greater than Line1");
	}

}
