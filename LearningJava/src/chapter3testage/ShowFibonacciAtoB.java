package chapter3testage;

public class ShowFibonacciAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1;

		while (y <= 100) {
			System.out.println(y);
			y = x+y;
			x = y-x;
		}
	}
}