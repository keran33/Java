/**
 * BreakExample - to test the break prooperty in a loop.
 *
 */

public class BreakExample{
	public static void main(String[] args){

		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 3; j++){

				if(i == 2 && j == 2){
					break;
				}
				System.out.println(i + "\t" + j);
			}
		}
	}
}
