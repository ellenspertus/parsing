package edu.mills.cs180a.parsing;

/**
 * Parser for phone numbers in the
 * <a href="https://en.wikipedia.org/wiki/North_American_Numbering_Plan"> North American Numbering
 * Plan</a>. Specifically, a phone number consists of a sequence of the following elements, the
 * first of which is optional:
 * <ul>
 * <li>the number 1 followed by a hyphen</li>
 * <li>a 3-digit area code followed by a hyphen</li>
 * <li>a 3-digit prefix followed by a hyphen</li>
 * <li>a 4-digit line number</li>
 * </ul>
 * All digits must be in the range 0-9.
 *
 * <p>
 * While the actual standard places restrictions on what digits can appear where, this
 * implementation does not.
 *
 * @author Ellen Spertus
 *
 */
public abstract class PhoneNumberParser {
    /**
     * Gets the <a href="https://en.wikipedia.org/wiki/Telephone_prefix">prefix </a> of a phone
     * number.
     *
     * @param s the phone number
     * @return an integer in the range 0 to 999
     * @throws IllegalArgumentException if the argument is not in the proper format
     */
    public abstract int getPrefix(String s) throws IllegalArgumentException;
}
