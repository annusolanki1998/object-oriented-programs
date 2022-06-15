package com.bridzelabz;

public class Stock {
    private static String shareName;
    private int numberOfShare;
    private int sharePrice;
    private int numberOfStocks;

    public Stock(String shareName, int numberOfShare, int sharePrice, int numberOfStocks) {
        this.shareName = shareName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
        this.numberOfStocks = numberOfStocks;
    }

    public Stock() {
    }

    public static String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", numberOfStocks=" + numberOfStocks +
                '}';
    }
}
