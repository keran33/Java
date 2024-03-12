/**
 * ConsMain2 - a simple example to use a constructor with a parameter.
 *
 */

class MyClass{
	int x;

	MyClass(int i){
		x = i;
	}

	public void setX(int z){
		x = z;
	}

	public int getX(){
		return x;
	}
}

public class ConsMain2{
	public static void main(String args[]){
		MyClass t1 = new MyClass(10);
		MyClass t2 = new MyClass(20);

		System.out.println(t1.getX() + " " + t2.getX());
		t2.setX(40);
		System.out.println(t1.getX() * t2.getX());
	}
}
