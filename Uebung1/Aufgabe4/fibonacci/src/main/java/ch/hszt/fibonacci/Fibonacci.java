package ch.hszt.fibonacci;

public class Fibonacci{
	public static void main(String args[]){
		int x = 0;
		System.out.println(x);
		int y = 1;
		System.out.println(y);
		int z;
		
		while(x < 10000){
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;		
		}
	}
}
