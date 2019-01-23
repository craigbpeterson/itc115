
public class Repetition {

	public static void main(String[] args) {
		repl("hello", 3);
		repl("world", 10);

	}
	
	public static void repl(String word, int reps) {
		String output = "";
		for (int i = 1; i <= reps; i++) {
			output += word;
		}
		
		System.out.println(output);
	}

}
