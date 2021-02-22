package io.assignment;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> {

	public static final Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
	@Override
	public boolean isValid(String str, ConstraintValidatorContext cvc) {
		if(str == null) {
			return false;
		}
		
		boolean result = isPassValid(str);
		return result;
	}
	
	public static boolean isPassValid(String text) {
		return textPattern.matcher(text).matches();
	}

}
