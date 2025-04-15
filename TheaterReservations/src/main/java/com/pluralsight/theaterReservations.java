package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class theaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine().trim();
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String middleName = "(none)";
        String lastName = "";

        if (nameParts.length == 2) {
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else if (nameParts.length > 3) {
            middleName = nameParts[1] + " " + nameParts[2]; // örnek: 4 parçalı isimler için
            lastName = nameParts[nameParts.length - 1];
        }

        System.out.print("What date will you be coming(MM/dd/yyyy): ");
        String dateInput = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate reservationDate = LocalDate.parse(dateInput, formatter);


        System.out.print("How many tickets would you like: ");
        int tickets = Integer.parseInt(input.nextLine());
        String ticketText;

        if (tickets == 1) {
            ticketText = "ticket";
        } else {
            ticketText = "tickets";
        }
        System.out.printf("%d %s reserved for %s under %s, %s\n", tickets,
                ticketText, reservationDate, lastName, firstName);



    }
}
