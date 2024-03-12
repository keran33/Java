/**
 * GenRand - to generate a random number between -53 ans 127 using
 * Math random and ceil classes.
 *
 */

public class GenRand{
	public static void main(String[] args){
		int x;
		x = -53 + (int)(Math.ceil(Math.random()*180));

		System.out.println(x);
	}}
