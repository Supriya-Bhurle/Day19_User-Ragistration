package com.bridgelabz.regex;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration regex = new UserRegistration();
        System.out.println("First Name : ");
        regex.validFirstName();
        System.out.println();
        System.out.println("Last Name :");
        regex.validLastName();
        System.out.println();
        System.out.println("Email address :");
        regex.validEmail();
        System.out.println();
        System.out.println("Mobile Number :");
        regex.validMobileNumber();
        System.out.println();
        System.out.println("Password Rule 1 :");
        regex.validPasswordRule1();
        System.out.println();
        System.out.println("Password Rule 2 :");
        regex.validPasswordRule2();
        System.out.println();
        System.out.println("Password Rule 3 :");
        regex.validPasswordRule3();
        System.out.println();
        System.out.println("Password Rule 4:");
        regex.validPasswordRule4();
    }
}
