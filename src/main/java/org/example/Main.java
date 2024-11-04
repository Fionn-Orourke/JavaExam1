package org.example;
import java.util.ArrayList;

public class Main {


    public  static void main(String[] args) {
        ArrayList<Customer> users = new ArrayList<Customer>();

        Customer user1 = new Customer();
        user1.setInfo("1","bill", "B@g", "085");
        System.out.println(user1);

        users.add(user1);
    }
}

