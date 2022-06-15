package com.bridzelabz;

import java.util.Scanner;

public class StockPortfolio {
    public static Scanner scanner = new Scanner(System.in);
    static Stock stock = new Stock();
    static Stock[] stocks;

    public static void main(String[] args) {
        System.out.println("Welcome to my Portfolio :");
        System.out.println("Enter the number of stocks");
        stock.setNumberOfStocks(scanner.nextInt());
        int valueOfStock = 0;
        int totalValueOfStocks = 0;
        for (int i = 0; i < stock.getNumberOfStocks(); i++) {
            System.out.println(addStock());
            valueOfStock = stock.getNumberOfShare() * stock.getSharePrice();
            System.out.println("Investing value of " + stock.getShareName() + " is :" + valueOfStock);
            totalValueOfStocks += valueOfStock;
        }

        System.out.println("Total Investing value of all stock is : " + totalValueOfStocks);

    }

    public static Stock addStock() {
        System.out.println("Enter the name of share :");
        stock.setShareName(scanner.next());

        System.out.println("Enter the number of share :");
        stock.setNumberOfShare(scanner.nextInt());

        System.out.println("Enter the share price :");
        stock.setSharePrice(scanner.nextInt());
        return stock;

    }
}

