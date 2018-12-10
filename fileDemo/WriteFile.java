package fileDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile
{
	public static void main(String[] args) throws IOException
	{
		int i=0;
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\aditnara\\Desktop\\java pract\\Project1\\adi.txt");
		String string = "Hello Aditya";
		//string.getBytes();
		byte arr[] = string.getBytes();
		fileOutputStream.write(arr);
		fileOutputStream.close();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\aditnara\\Desktop\\java pract\\Project1\\adi.txt");
		while((i=fileInputStream.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
