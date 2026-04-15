package com.pluralsight;

public class CellPhone {

    /*- serialNumber (ex: 1000000 - 9999999)
      - model (ex: iPhone X)
      - carrier (ex: AT&T)
      - phoneNumber (ex: 800-555-5555)
      - owner (ex: Dana Wyatt)
   */

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    // gets
    public int getSerialNumber() {
        return this.serialNumber;
    }
    public String getModel() {
        return this.model;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getOwner() {
        return owner;
    }

    // voids
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
