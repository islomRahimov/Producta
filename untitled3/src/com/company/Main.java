package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import  static  java.lang.System.in;
public class Main {

    public static void main(String[] args) {
        // write your code here
      User user = new User();
        System.out.println("KR");
        ArrayList<User>arrayList = new ArrayList<>();
        System.out.println("Welcome PX");
        while (true){
            System.out.println("Product [1]");
            System.out.println("History [1]");
            System.out.println("Product List [3]");
            System.out.println("= ");

        }

    }
}
interface Kr{
    void product (ArrayList<User>arrayList);

    void history (ArrayList<User>arrayList);

    void list(ArrayList<User> arrayList);
}
class User implements Kr{
    String name;
    String phone;
    String productName;
    int card;

    public User(String name, String phone, String productName) {

    }public User() {
        this.name = name;
        this.productName = productName;
        this.card = card;
        this.phone = phone;
    }

    @Override
    public void product(ArrayList<User> arrayList) {
        Scanner scanner = new Scanner(in);
        System.out.print("User name write: ");
        String name = scanner.nextLine();
        System.out.print("User phone write: ");
        String phone = scanner.nextLine();
        System.out.print("User productName write: ");
        String productName = scanner.nextLine();
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User(name,phone,productName));
    }

    @Override
    public void history(ArrayList<User> arrayList) {
        System.out.println("History");
        System.out.println();
        for (User name : arrayList){
            System.out.println(name.productName);
        }
    }

    @Override
    public void list(ArrayList<User> arrayList) {
        System.out.println("List");
        System.out.println();
        for (User user : arrayList){
            System.out.println(user.name + " " + user.phone + " " + user.productName);
        }
    }
}