import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
	static Scanner sc;

	public static void main(String[] args) throws InputMismatchException {
		while(true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("Input number thats greater than 0");
				int number = sc.nextInt();
				if(number < 1) {
					System.out.println("Make sure input is greater than 0");
					continue;
				}
				symbol(number, '*');
				System.out.println("");
				System.out.println(factorial(number));
				sc.close();
				System.out.println("Program ended");
				return;
			} catch (InputMismatchException e) {
				System.out.println("Make sure input is an integer");
			}
		}
	}

	public static void symbol(int n, char c) {
		if(n == 0) return;
		symbol(n - 1, c);
		for(int i = 0; i < n; i++) System.out.print(c);
		System.out.println("");
	}

	public static int factorial(int n) {
		if(n == 1) return 1;
		return n * factorial(n - 1);
	}
}
