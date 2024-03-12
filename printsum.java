/**
 * Java program to print integers between 1 and 30 and their cumulative sum
 *
 */
public class printsum{
	public static void main(String[] args){
		int x;
		int sum = 0;

		for(x = 1; x <= 30; x++)
		{
			System.out.println(x);
			sum += x;
		}
	        System.out.println("The sum is: "+sum);
	}
}
