package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. İki telefon nesnesi oluştur
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();

        // 2. Kullanıcıdan telefon 1 bilgilerini al
        System.out.println("📱 Phone 1 Info:\n");

        System.out.print("What is the serial number? ");
        long serialNumber = input.nextLong();
        input.nextLine(); // Enter'ı temizle

        System.out.print("What model is the phone? ");
        String model = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = input.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = input.nextLine();

        // 3. Alınan bilgileri phone1'e set et
        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);


        // 2. Kullanıcıdan telefon 2 bilgilerini al
        System.out.println("📱 Phone 2 Info:\n");

        System.out.print("What is the serial number of Phone 2? ");
        long serialNumber1 = input.nextLong();
        input.nextLine(); // Enter'ı temizle

        System.out.print("What model is the phone 2? ");
        String model1 = input.nextLine();

        System.out.print("Who is the carrier of Phone 2? ");
        String carrier1 = input.nextLine();

        System.out.print("What is the phone number of Phone 2? ");
        String phoneNumber1 = input.nextLine();

        System.out.print("Who is the owner of the phone of Phone 2? ");
        String owner1 = input.nextLine();
        // 4. Alınan bilgileri phone1'e set et
        phone2.setSerialNumber(serialNumber1);
        phone2.setModel(model1);
        phone2.setCarrier(carrier1);
        phone2.setPhoneNumber(phoneNumber1);
        phone2.setOwner(owner1);

        // 5. Bilgileri göster
        System.out.println("\n📱 Phone 1 Info:");
        display(phone1);

        System.out.println("\n📱 Phone 2 Info:");
        display(phone2);

        // 6. Karşılıklı arama
        System.out.println("\n Dialing:");
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

        input.close();
    }

    // ✅ main metodunun dışında, sınıfın içinde olmalı!
    public static void display(CellPhone phone) {
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
    }
}