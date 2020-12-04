package edu.mills.cs180a.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A {@link PhoneNumberParser} demonstrating the use of regular expressions.
 */
public class RegexParser extends PhoneNumberParser {
    private static final String PHONE_REGEX = "(1-)?\\d{3}-(\\d{3})-(\\d{4})";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    @Override
    public int getPrefix(String s) throws IllegalArgumentException {
        Matcher matcher = PHONE_PATTERN.matcher(s);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(2));
        }
        throw new IllegalArgumentException("Not a valid phone number: " + s);
    }
}
