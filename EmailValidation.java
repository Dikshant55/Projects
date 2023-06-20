package com.Example.Regex;

import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {

		String email1 = "dikshant2345@gmail.com";
		String email2 = "acbg5mail.com";

		if (emailCheck(email1) && email1.length() == 22) {

			System.out.println("Very Good");
		}
		System.out.println(emailCheck(email2));
	}

	public static boolean emailCheck(String mail) {

		if (mail == null || mail.isEmpty()) {
			return false;
		}

		String rgx = "^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
				+ "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(rgx);
		if (pattern.matcher(mail).matches()) {
			return true;
		} else
			return false;

	}

}
