package dev.aman;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails=ContactData.getData("email");
        List<Contact> phones=ContactData.getData("phone");

//        printData("Phone list",phones);
//        printData("email List",emails);


        Set<Contact> emailContacts=new HashSet<>(emails); //Duplicates removed
        Set<Contact> phoneContacts=new HashSet<>(phones);

        printData("Phone Contacts",phoneContacts);
        printData("Email contacts",emailContacts);

    int index=emails.indexOf(new Contact("Aman"));

    Contact aman=emails.get(index);
    aman.addEmail("Equ Nile");
        aman.addEmail("Equ Nile");
        aman.replaceEmailIfExists("AAman@EquNile.com","AAman@EquNile.org");



        System.out.println("Aman is " + aman);

    }

    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("___________________________________");
        System.out.println(header);
        System.out.println("____________________________________");
        contacts.forEach(System.out::print);

    }
}