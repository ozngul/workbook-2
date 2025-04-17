package com.pluralsight;

public class CellPhone {
    // 1. Özellikler (veri üyeleri)

    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // 2. Parametresiz yapıcı method (constructor)
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Getter ve Setter'lar constructor'ın dışında olmalı!
    // 3. Getter ve Setter'lar (veriye erişim kapıları)

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //  DIAL METHODU
    public void dial(String number) {
        System.out.println(owner + "'s phone is calling " + number);
    }
}