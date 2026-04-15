package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
          /*- serialNumber (ex: 1000000 - 9999999)
      - model (ex: iPhone X)
      - carrier (ex: AT&T)
      - phoneNumber (ex: 800-555-5555)
      - owner (ex: Dana Wyatt)
   */

       /* What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
          */


        CellPhone phone1 = new CellPhone(2597153, "IPhone 15 Pro Max", "Verizon", "888-555-1234", "Sandra");

       System.out.println("What is the serial number?: " + phone1.getSerialNumber());
       System.out.println("What is the model?: " + phone1.getModel());
       System.out.println("Who is the carrier?:  " + phone1.getCarrier());
       System.out.println("What is the phone number?: " + phone1.getPhoneNumber());
       System.out.println("Who is the owner of the phone?: " + phone1.getOwner());


    }
}

