package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.CellPhone.display;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone(1234567, "IPhone 15", "T-Mobile", "(123)-456-7890", "Sandy");

        CellPhone phone2 = new CellPhone(3591113, "IPhone 16e", "Verizon", "(357)-911-1315", "Patrick");

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

        display(phone1);
        display(phone2);




    }
}

