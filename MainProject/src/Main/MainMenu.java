package Main;

import java.util.Scanner;

public class MainMenu
{
		public static void main(String[] args) {
			boolean condition = true;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Your choice :");
			do {
				System.out.println("1. Display Books");
				System.out.println("2. Update Books detail only for Librarian");
				System.out.println("3. Add to cart");
				System.out.println("4. Return your book");
				System.out.println("5. Your Feedback");
				System.out.println("6 Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					try {

					} catch (Exception e) {
						System.out.println(e);
					}
				case 2:
					try {

					} catch (Exception e) {
						System.out.println(e);
					}
				case 3:
					try{
						
					}catch (Exception e)
					{
						System.out.println(e);
					}
				case 4:
					try{
						
					}catch (Exception e)
					{
						System.out.println(e);
					}
				case 5:
					try{
						
					}catch (Exception e)
					{
						System.out.println(e);
					}
				case 6:
					
					default :
					{
						try {
							
						} catch (Exception e) {
							System.out.println(e);
						}
					}
				}
			} while (condition);
		}
	}
