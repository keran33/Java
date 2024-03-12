/**
 * MethodOverloading - to check concept of methods having
 * the same name but different parameters.
 *
 */
import java.util.Scanner;
public class MethodOverloadingEx{
	public static void main(String[] args){
		introMessage();
		int option1 = 1;/*userInput1();*/

		switch(option1){
		case 1:
			System.out.println("Please enter three integers");
			Scanner i = new Scanner(System.in).useDelimiter("\\s");

			int a = i.nextInt();
			int b = i.nextInt();
			int c = i.nextInt();

			int SumOfThreeInt = sum(a, b, c);
			System.out.println(SumOfThreeInt);

			break;
		case 2:
			System.out.println("Enter three double values");
			Scanner j = new Scanner(System.in).useDelimiter("\\s");

			double x = j.nextDouble();
			double y = j.nextDouble();
			double z = j.nextDouble();

			double SumOfThreeDouble = sum(x, y, z);
			System.out.println(SumOfThreeDouble);

			break;
		case 3:
			System.out.println("Enter two integers and on double value(in that order)");
			Scanner k = new Scanner(System.in).useDelimiter("\\s");

			int f = k.nextInt();
			int g = k.nextInt();
			double h = k.nextInt();

			double SumOfTwoIntOneDouble = sum(f, g, h);
			System.out.println(SumOfTwoIntOneDouble);

			break;
		case 4:
			System.out.println("Enter four integers");
			Scanner l = new Scanner(System.in).useDelimiter("\\s");

			int w = l.nextInt();
			int xx = l.nextInt();
			int yy = l.nextInt();
			int zz = l.nextInt();

			int SumOfFourInt = sum(w, xx, yy, zz);
			System.out.println(SumOfFourInt);

			break;
		default:
			System.out.println("Please try again");
		}

		System.out.println(option1);
	}
	static void introMessage(){
		System.out.println("Hello, this is a program designed to do the following:");
		System.out.println();
		System.out.println("1) Add three integers");
		System.out.println("2) Add three double values");
		System.out.println("3) Add two integers and one double value(in that order)");
		System.out.println("4) Add four integers");
		System.out.println();
		System.out.println("What would you like to do? (Choose a number)");
	}
	static int userInput1(){
		Scanner sc = new Scanner(System.in);
		int option1 = sc.nextInt();
		System.out.println();
		sc.close();
		return option1;
	}
	static int sum(int k, int l, int m){
		int SumOfInt = (k + l + m);
		return SumOfInt;
	}
	static double sum(double a, double b, double c){
		double SumofDouble = (a + b + c);
		return SumofDouble;
	}
	static double sum(int i, int j, double k){
		double SumofIntDouble = (i + j + k);
		return SumofIntDouble;
	}
	static int sum(int w, int x, int y, int z){
		int SumoffourInt = (w + x + y + z);
		return SumoffourInt;
	}
}
