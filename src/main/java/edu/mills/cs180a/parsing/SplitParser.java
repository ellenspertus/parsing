package edu.mills.cs180a.parsing;

/**
 * A {@link PhoneNumberParser} demonstrating the use of {@link String#split(String)}.
 */
public class SplitParser extends PhoneNumberParser {
    @Override // 1-510-430-2011
    public int getPrefix(String s) throws IllegalArgumentException {
        String[] parts = s.split("-");
        if (parts.length < 4) {
            throw new IllegalArgumentException("Not enough hyphens: " + s);
        }
        String prefixString = parts[2]; // "430"
        return Integer.parseInt(prefixString);
    }
}
