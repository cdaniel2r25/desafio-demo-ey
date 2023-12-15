package com.example.demo.ey.config.annotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<PasswordValid, String> {

	@Override
	public void initialize(PasswordValid arg0) {
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {

		Pattern p = Pattern.compile("^(?=(?:.*\\d){2})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})\\S{3,}$");

		if (password == null) {

			return false;
		}

		Matcher m = p.matcher(password);
		return m.matches();

	}

}
