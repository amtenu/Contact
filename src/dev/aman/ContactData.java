package dev.aman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String phoneData= """
            Jake Dawson,2343525252
            Tom Cruz,2433426226
            Samuel Jackson,3343434352
            Tom Cruz,2332422422
            Samuel Jackson,3343434352
            Aman,2323232322
            """;
    private static final String emailData= """
            Jake Dawson,jake@gmail.com
            Tom Cruz,tom@gmail.com
            Samuel Jackson,samuel@gmail.com
            Samuel Jackson,samuel12@gmail.com
            Aman,aman@gmail.com
            """;


    public static List<Contact> getData(String type){
        List<Contact> dataList=new ArrayList<>();
        Scanner scanner=new Scanner(type.equals("phone") ? phoneData:emailData);
        while(scanner.hasNext()){
            String[] data=scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if(type.equals("phone")){
                dataList.add(new Contact(data[0],Long.parseLong(data[1])));
            } else if (type.equals("email")) {
                dataList.add(new Contact(data[0],data[1]));

            }
        }
        return dataList;

    }
}
