package by.academy.classwork.lesson5;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stroki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1= new String("Ненси хочет1 кушатьНН");

		Pattern pat=Pattern.compile("\\W");
		
		Matcher match=pat.matcher(text1);
		
		while(match.find()) {
			System.out.println(match.group());
			System.out.println(match.start() +" " + match.end());
			
		}
					
		
		}


}
