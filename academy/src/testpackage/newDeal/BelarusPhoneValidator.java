package testpackage.newDeal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{

	Pattern pattern = Pattern.compile("^375");

	@Override
	public boolean validate(String num) {
		System.out.println(num);
		Matcher m = pattern.matcher(num);
		if (m.find()) {
			
			return true;
		}
		return false;
	}
}
