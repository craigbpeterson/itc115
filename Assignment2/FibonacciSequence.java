
public class FibonacciSequence {

	public static void main(String[] args) {
		//Fibonacci Loop
		System.out.println();
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
