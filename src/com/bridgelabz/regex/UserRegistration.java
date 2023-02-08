package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public  void validFirstName() {
        // compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        // get a matcher object from pattern
        Matcher matcher = pattern.matcher("Supriya");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
}
