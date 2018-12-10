package fileDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamDemo
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fileOutputStream = new FileOutputStream("aditya.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeUTF("It is DataOutputStream");
		dataOutputStream.writeInt(10);
		dataOutputStream.writeChar('i');
		FileInputStream fileInputStream = new FileInputStream("aditya.txt");
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		System.out.println(dataInputStream.readUTF());
		System.out.println(dataInputStream.readChar());
	}
}
