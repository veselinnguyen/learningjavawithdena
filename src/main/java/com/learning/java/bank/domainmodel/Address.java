package com.learning.java.bank.domainmodel;

public class Address {
    private String streetName;
    private String postalCode;
    private int houseNumber;
    private AddressType type;

    public Address() {
    }

    public Address(String streetName, String postalCode, int houseNumber, AddressType type) {
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.type = type;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }
}
