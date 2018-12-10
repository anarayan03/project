package regilarexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression
{

	/*void patternMatching(String patt) 
	{
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2,6}");
		Matcher matcher = pattern.matcher(patt);
		System.out.println(matcher.matches());
	}

	void checkMobile(String mobileno)
	{
		Pattern pattern = Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileno);
		System.out.println(matcher.matches());
	}
	*/
	void checkMail(String email)
	{
		Pattern pattern = Pattern.compile("[a-z.[0-9]]*@capgemini.com");
		Matcher matcher = pattern.matcher(email);
		System.out.println(matcher.matches());
	}
	
	public static void main(String[] args) {
		/*String input = "Shop.Mop,Hopping,Chopping";
		Pattern pattern = Pattern.compile("hop");
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.matches());
		while (matcher.find()) {
			System.out.println(matcher.group() + "; " + matcher.start() + ":" + matcher.end());
			RegularExpression re = new RegularExpression();
			re.patternMatching("Aditya");
			re.checkMobile("7277615946");*/
			RegularExpression re = new RegularExpression();
			re.checkMail("aditya.narayan@capgemini.com");
		}
}
