//6.2
package exception;

import java.util.Scanner;

public class MainException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age :");
		int age = scanner.nextInt();
		try {
			if (age < 18)
				throw new AgeException("Invalid age");
			else
				System.out.println("Valid age");
		} catch (AgeException e) {
			System.out.println(e);
		}
	}

}
