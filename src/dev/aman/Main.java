package dev.aman;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails=ContactData.getData("email");
        List<Contact> phones=ContactData.getData("phone");

        printData("Phone list",phones);
        printData("email List",emails);



    }

    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("___________________________________");
        System.out.println(header);
        System.out.println("____________________________________");
        contacts.forEach(System.out::print);

    }
}