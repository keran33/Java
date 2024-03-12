/**
 * OddSum2 - to generate 20 integers between 1 and 67 and
 * print them if they are odd and their sum.
 *
 */
public class OddSum2{
	public static void main(String[] args){
		int sum = 0;
		int RandInt;

		for(int i = 1; i <= 20; i++)
		{
			RandInt = (int)(1 + Math.ceil(Math.random() * 66));

			if(RandInt % 2 == 1)
			{
				System.out.println(RandInt);
				sum += RandInt;
			}
		}
		System.out.println(sum);
	}
}
