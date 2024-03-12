/**
 * SumInt - print integers between 1 and 30 and their sum.
 *
 */
class SumInt{
	public static void main(String[] args){
		int sum = 0;

		for(int i = 1; i <=30; i++)
		{
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("The sum of the numbers is " + sum);
	}
}
