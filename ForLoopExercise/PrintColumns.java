/**
 * PrintColumns - print integers 1-100 in two columns
 * even and odd and their sum.
 *
 */
public class PrintColumns{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i);
			}
			System.out.print("\t");
			if(i % 2 == 1)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
