package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    public final static Pattern pattern = Pattern.compile("^([a-z0-9_\\-]+\\.)*[a-z0-9_\\-]+@[a-z0-9_\\-]+(\\.[a-z0-9_\\-]+)*\\.[a-z]{2,6}$");

    @Override
    public boolean validator(String strEmailValidator) {
       		Matcher matcher = pattern.matcher(strEmailValidator);
    		return matcher.matches();
    }
}

