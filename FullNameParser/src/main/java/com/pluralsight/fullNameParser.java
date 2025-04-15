package com.pluralsight;

import java.util.Scanner;

public class fullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fullName = input.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String middleName = "(none)";
        String lastName = nameParts[nameParts.length - 1];

        if (nameParts.length == 3) {
            middleName = nameParts[1];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
