package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // 1. CellPhone nesnesi oluştur
        CellPhone phone = new CellPhone();
        Scanner input = new Scanner(System.in);
        // 2. Bilgileri ayarla (set et)
/*
        phone.setSerialNumber(1234567);
        phone.setModel("iPhone X");
        phone.setCarrier("AT&T");
        phone.setPhoneNumber("800-555-5555");
        phone.setOwner("Dana Wyatt");
*/

        // Kullanıcıdan bilgiler alınıyor
        System.out.print("What is the serial number? ");
        long serialNumber = input.nextLong();
        input.nextLine();

        System.out.print("What model is the phone? ");
        String model = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = input.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = input.nextLine();

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
    }
}
