package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
          */


        CellPhone phone1 = new CellPhone(2597153, "IPhone 15 Pro Max", "Verizon", "888-555-1234", "Sandra");

       System.out.print("What is the serial number?: ");
       phone1.setSerialNumber(sc.nextInt());
       sc.nextLine();
       System.out.print("What is the model?: ");
       phone1.setModel(sc.nextLine());
       System.out.print("Who is the carrier?: ");
       phone1.setCarrier(sc.nextLine());
       System.out.print("What is the phone number?: ");
       phone1.setPhoneNumber(sc.nextLine());
       System.out.print("Who is the owner of the phone?: ");
       phone1.setOwner(sc.nextLine());

        System.out.println(phone1.getSerialNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getCarrier());
        System.out.println(phone1.getPhoneNumber());
        System.out.println(phone1.getOwner());

    }
}

