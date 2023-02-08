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
    public  void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Bhurle");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    public void  validEmail(){

        Pattern pattern = Pattern.compile("^([a-zA-Z0-9.]+)@([a-zA-Z0-9.]+).([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher("supriyabhurle09@gmail.com");
        if (matcher.matches()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}


