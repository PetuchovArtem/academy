package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
   
    @Override
    public boolean validator(String strEmailValidator) {
    	 final Pattern pattern = Pattern.compile("^([a-z0-9_\\-]+\\.)*[a-z0-9_\\-]+@[a-z0-9_\\-]+(\\.[a-z0-9_\\-]+)*\\.[a-z]{2,6}$");

       		Matcher matcher = pattern.matcher(strEmailValidator);
       			return matcher.matches();
    }
}

