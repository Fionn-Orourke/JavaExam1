package org.example;
import java.util.ArrayList;
import java.util.Objects;

public class Main {


    public  static void main(String[] args) {
        ArrayList<Customer> users = new ArrayList<Customer>();

        Customer user1 = new Customer();

        user1.setInfo("g","bill", "B@g", "085");

        users.add(user1);

        Customer user2 = new Customer();
        int i;
        for(i = users.size(); i > 0; i--){
            if(users.get(i).customerId == user2.getCustomerId()){
                System.out.println("UserID already exists");
            }
            else{
                System.out.println("UserID is unique\n new user added");
            }
        }


        for(i = users.size(); i >=0; i--){
            if(Objects.equals(users.get(i).customerId, user2.getCustomerId())){
        }

    }
}

