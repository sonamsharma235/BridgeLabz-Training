package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static void extractEmails(String text) {
        Pattern pattern = Pattern.compile(
                "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"
        );
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String text =
                "Contact us at support@example.com and info@company.org";
        extractEmails(text);
    }
}

