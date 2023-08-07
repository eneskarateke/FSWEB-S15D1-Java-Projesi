package com.workintech.arrays.grocery.groceryList.main;

import com.workintech.arrays.grocery.groceryList.MarketCar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
List<String> groceryList = new LinkedList<>();
startGrocery(groceryList);
    }


    public static void startGrocery(List<String> groceryList ){
        Scanner scanner =  new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Yapmak istediğiniz işlem nedir?");
                int process = scanner.nextInt();
                ;
                if (process < 0 || process > 2) {
                    System.out.println("İşlem 0 ile 2 arasında olmalıdır.");
                }

                if (process==0) {
                    System.exit(0);
                }
                if (process==1){
                    MarketCar.addItems(groceryList);
                }
                if (process==2){
                    MarketCar.removeItems(groceryList);
                }

            } catch (Exception ex) {
                System.out.println("Invalid process: " + ex.getMessage());
break;

            }
        }

    }
}