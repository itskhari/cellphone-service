package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
          /*- serialNumber (ex: 1000000 - 9999999)
      - model (ex: iPhone X)
      - carrier (ex: AT&T)
      - phoneNumber (ex: 800-555-5555)
      - owner (ex: Dana Wyatt)
   */
        CellPhone phone1 = new CellPhone(9897931, "IPhone 17e", "Xfinity", "(404) 447-3412", "Iceman");

        CellPhone phone2 = new CellPhone(7281354, "IPhone XR", "T-Mobile", "(678) 210-4719", "Ryan Poles");

        phone2.setOwner("Colston Loveland");
        phone1.setOwner("Caleb Iceman Williams");

        System.out.println(phone1.getOwner());
        System.out.println(phone2.getOwner());
    }
}

