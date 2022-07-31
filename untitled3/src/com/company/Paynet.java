package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Paynet {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User();
        System.out.println("KR");
        ArrayList<User>arrayList = new ArrayList<>();
        System.out.println("Welcome PX");
        while (true){
            System.out.println("ProductName [1]");
            System.out.println("History [2]");
            System.out.println("Product List [3]");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n){
                case 1 -> {
                    user.product(arrayList);
                }
                case 2 -> {
                    user.history(arrayList);
                }
                case 3 -> {
                    user.list(arrayList);
                }
            }
        }
    }
}
