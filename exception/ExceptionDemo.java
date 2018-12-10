package exception;

public class ExceptionDemo
{
	public static void main(String[] args) {
		int a=5;
		int b=0;
		int c;
		int arr[] = new int[2];
		try
		{
			//c=a/b;
			//arr[3]=20;
			String str = null;
			str.length();
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}*/
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
