package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation
{
	
	public boolean checkId(String id)
	{
		Pattern pattern = Pattern.compile("[0-9]{3}");
		Matcher matcher = pattern.matcher(id);
		return matcher.matches();
	}
	
	public boolean checkBookName(String bookName)
	{
		Pattern pattern = Pattern.compile("[A-Z][a-z]");
		Matcher matcher = pattern.matcher(bookName);
		return matcher.matches();
	}
	
	public boolean checkAuthorName(String authorName)
	{
		Pattern pattern = Pattern.compile("[A-Z][a-z]");
		Matcher matcher = pattern.matcher(authorName);
		return matcher.matches();
	}
	
	public boolean checkPrice(String bookId)
	{
		Pattern pattern = Pattern.compile("[0-9]{10}");
		Matcher matcher = pattern.matcher(bookId);
		return matcher.matches();
	}
	
	public boolean checkQuantity(String bookId)
	{
		Pattern pattern = Pattern.compile("[0-9]{10}");
		Matcher matcher = pattern.matcher(bookId);
		return matcher.matches();
	}
	
}
