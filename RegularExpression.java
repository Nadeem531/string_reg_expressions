package str_reg_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression {
	
    public static void main(String[] args) {
    	String pattern = "[a-z]+";
    	String check = "The Movies";
    	Pattern p =Pattern.compile( pattern);
          Matcher b =p.matcher(check);
    while(b.find())
    	System.out.println(check.substring(b.start(),b.end() ) );
    }
}
