/**
 * OddSum - to generate 20 integers between 1 and 67
 * print them only if they are odd and their sum.
 *
 */
public class OddSum{
	public static void main(String[] args){
		int RandInt;
		int sum = 0;

		for(int i = 1; i <= 20; i++)
		{
			RandInt = (int)(1 + Math.ceil(Math.random()*66));

			if (RandInt % 2 == 1)
				     {
					     System.out.println(RandInt);
					     sum += RandInt;
				     }
		}
		System.out.println(sum);
	}
}
