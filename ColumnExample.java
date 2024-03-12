/**
 * ColumnExample - to print integer numbers from 1 - 100
 * in columns of ten.
 * 13/02/24
 * Keran
 */
public class ColumnExample{
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++)
		{
				System.out.print(i + "\t");
				if(i % 10 == 0)
				{
					System.out.println();
				}/*end if*/
		}/*end loop*/
	}/*end main*/
}
