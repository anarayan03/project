package fileDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainProduct
{

	public static void main(String[] args) throws IOException 
	{
		try(
		FileOutputStream fileOutputStream = new FileOutputStream("Product");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);)
		{
			Product product = new Product(1, "Soap", 100);
			objectOutputStream.writeObject(product);
			objectOutputStream.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		try(
				FileInputStream fileInputStream = new FileInputStream("Product");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);)
				{
					Product product = (Product)objectInputStream.readObject();
					System.out.println(product.productId);
					System.out.println(product.productName);
					System.out.println(product.productPrice);
					objectInputStream.close();
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
	}

}
