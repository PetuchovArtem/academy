package by.academy.deal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private Pattern pattern = Pattern.compile("\\+(1)\\d{10}");

	@Override
	public boolean validator(String str) {
		
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
