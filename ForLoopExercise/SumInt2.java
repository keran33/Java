/**
 * SumInt2 - to generate 20 integer numbers between 1 - 30 and print their sum.
 *
 */
public class SumInt2{
	public static void main(String[] args){
		int sum = 0;
		int RandInt;

		for(int i = 1; i <= 20; i++)
		{
			RandInt = (int)(1 + Math.ceil(Math.random()*29));
			System.out.println(RandInt);
			sum += RandInt;
		}
		System.out.println("The sum of these randomly generated numbers is " + sum);
	}
}
