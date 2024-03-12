/**
 * ConsMain - simple example to use a constructor without parameters.
 *
 */

class MyClass{
	int x;

	MyClass(){
		x = 10;
	}

	public void setX(int z){
		x = z;
	}

	public int getX(){
		return x;
	}
}

public class ConsMain{
	public static void main(String[] args){
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		System.out.println(t1.getX() + " " + t2.getX());
		t2.setX(34);
		System.out.println(t1.getX() * t2.getX());
	}
}
