/**
 * TA2 - passing an array to method. Getting the minimum number of an array
 * using a method.
 *
 */

public class TestArray2{
	static void min(int arr[]){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
			if(min > arr[i])
				min = arr[i];
		System.out.println(min);
	}
	public static void main(String[] args){
		int a[] = {33, 3, 4, 5};
		min(a);
	}
}
