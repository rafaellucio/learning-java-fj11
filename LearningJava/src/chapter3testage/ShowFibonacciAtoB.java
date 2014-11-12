package chapter3testage;

public class ShowFibonacciAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1;

		for (int i = 0; i <= 15; i++) {
			if (i > 1) {
				int z = x + y;
				x = y;
				y = z;
				System.out.println(z);
			} else {
				System.out.println(i);
			}
		}
	}
}