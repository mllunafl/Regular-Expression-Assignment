package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String PATTERN = "My very educated mother just served up nine pizzas";

    static private Pattern pattern;
    static private Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile("[mvj]");
        matcher = pattern.matcher(PATTERN);
        match();

        pattern = Pattern.compile("[^aeiouy]");
        matcher = pattern.matcher(PATTERN);
        match();

        pattern = Pattern.compile("[a-di-m]");
        matcher = pattern.matcher(PATTERN);
        match();

        pattern = Pattern.compile("\\s");
        matcher = pattern.matcher(PATTERN);
        match();

        pattern = Pattern.compile("v.*d");
        matcher = pattern.matcher(PATTERN);
        match();

        pattern = Pattern.compile("v.?d");
        matcher = pattern.matcher(PATTERN);
        match();

    }

    private static void match() {
        System.out.println("\nMatching...");
        boolean found = false;
        while (matcher.find()) {
            System.out.printf("Matched \"%s\" starting at %d and ending at %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
            found = true;
        }
        if (!found){
            System.out.println("No match found.");
        }
    }
}
