package fileDemo;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyDemo
{
	public static void main(String[] args)
	{
		try(FileReader inputStream = new FileReader("adi.txt");
			FileWriter outputStream = new FileWriter("nar.txt");)
		{
			int c;
			while((c= inputStream.read())!=-1)
			{
				outputStream.write(c);
			}
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
