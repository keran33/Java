/**
 * Cylinder - to find the surface area and volume of a regular cylinder.
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Cylinder{
	static double PI = 3.14;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the height ");
		int height = sc.nextInt();
		System.out.println("Enter the radius ");
		int radius = sc.nextInt();

		double SurfaceArea = surfaceArea(height, radius);
		double Volume = volume(height, radius);
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("The surface area of the cylinder is " + df.format(SurfaceArea));
		System.out.println("The volume of the cylinder is " + df.format(Volume));
	}
	/* Beginning of method to calculate the Surface area */
	static double surfaceArea(int h, int r){
		double SurfaceArea2 = (2 * PI * r * h) + (2 * PI * r * r);
		return SurfaceArea2;
		}
	/*Beginning of method to calculate the Volume */
	static double volume(int h, int r){
		double Volume2 = (PI * r * r * h);
		return Volume2;
	}
}
