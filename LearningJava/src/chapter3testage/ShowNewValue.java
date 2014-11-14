package chapter3testage;

public class ShowNewValue {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int x = 10;
		
		while(x >= 1){
			if(x%2 == 0) {
				x = x / 2;
			}else {
				x = 3 * x + 1;				
			}
			System.out.println(x);
			
			if(x == 1) break;
		}
	}

}
