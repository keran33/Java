/**
 * RectMain2 - a method that receives a Rectangle object and process it.
 *
 */
import java.util.Scanner;
public class RectMain2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width");
		int wid = scan.nextInt();
		System.out.println("Enter the length");
		int len = scan.nextInt();
		Rectangle rect = new Rectangle(wid, len);
		printRectangle(rect);
	}
	public static void printRectangle(Rectangle R){
		System.out.println("The width of the rectangle is " + R.getWidth());
		System.out.println("The Length of the rectangle is " + R.getLength());
		System.out.println("The area of the new rectangle is " + R.area());
	}
}
