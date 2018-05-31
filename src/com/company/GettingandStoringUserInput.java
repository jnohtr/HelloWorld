package com.company;

import java.util.Scanner;

public class GettingandStoringUserInput {

    public static void main(String[] args) {
	// write your code here


        Scanner keyboard = new Scanner(System.in);
        //String myanswer =  keyboard.next();
        System.out.println("what's your first initial? : ");
        String firstInitial = keyboard.next();

        System.out.println("what's your lastName? : ");
        String lastName = keyboard.next();

        System.out.println("what's your houseNumber? : ");
        int houseNumber = keyboard.nextInt();

        System.out.println("what's your streetName? : ");
        String streetName = keyboard.next();

        System.out.println("what's your streetType,? : ");
        String streetType = keyboard.next();

        System.out.println("what's your streetName? : ");
        String city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}
