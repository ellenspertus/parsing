package edu.mills.cs180a.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    private static final String MILLS_NUMBER = "1-510-430-2255";
    private static final String PHONE_REGEX = "1-\\d{3}-(\\d{3})-(\\d{4})";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    public static void main(String[] args) {
        PhoneNumberParser myParser = new RegexParser();
        System.out.println(myParser.getPrefix(MILLS_NUMBER.substring(2)));
        // System.out.println(myParser.getPrefix("430-2011")); // IllegalArgumentException
    }
}

