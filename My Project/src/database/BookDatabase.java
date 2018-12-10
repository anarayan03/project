package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Entity.Book;
import validation.Validation;

public class BookDatabase {
	// public static void main(String[] args)
	// {
	void database() {
		
		 Book book = new Book();
		 Validation validation = new Validation();
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//10.219.34.3:1521/orcl", "trg706",
					"training706");
			Statement statement = con.createStatement();
			PreparedStatement preparedStatement = con.prepareStatement("insert into book values(?,?,?,?,?)");
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter book id");
			int id = scanner.nextInt();
			if(validation.checkId(id))
			{
			preparedStatement.setInt(1, id);
			// book.setBookId(id);
			}
			else
			{
				
			}

			System.out.println("Enter book Name");
			String bookName = scanner.next();
			if(validation.checkId(id))
			{
			preparedStatement.setString(2, bookName);
			// book.setBookName(bookName);
			}
			else
			{
				
			}
			
			System.out.println("Enter book Author Name");
			String authorName = scanner.next();
			preparedStatement.setString(3, authorName);
			// book.setAuthorName(authorName);
			
			System.out.println("Enter book Price");
			int price = scanner.nextInt();
			preparedStatement.setInt(4, price);
			// book.setPrice(price);

			System.out.println("Enter book Quantity");
			int quantity = scanner.nextInt();
			preparedStatement.setInt(5, quantity);
			// book.setQuantity(quantity);

			preparedStatement.executeQuery();

			/*
			 * for(int i=0;i<=5;i++) { preparedStatement.setInt(1, scanner.nextInt());
			 * preparedStatement.setString(2, scanner.nextLine());
			 * preparedStatement.setString(3, scanner.nextLine());
			 * preparedStatement.setInt(4, scanner.nextInt()); preparedStatement.setInt(5,
			 * scanner.nextInt()); }
			 */
			ResultSet resultSet = statement.executeQuery("select * from book");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
						+ "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5));

				/*
				 * System.out.print(book.getBookId(resultSet.getInt(1)));
				 * System.out.print("\t"+book.getBookName(resultSet.getString(2)));
				 * System.out.print("\t"+book.getAuthorName(resultSet.getString(3)));
				 * System.out.print("\t"+book.getPrice(resultSet.getInt(4)));
				 * System.out.print("\t"+book.getQuantity(resultSet.getInt(5))); break;
				 */
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
