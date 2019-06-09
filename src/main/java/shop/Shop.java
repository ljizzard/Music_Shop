package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int stockItemCount(){
        return stock.size();
    }
    public void addStock(ISell item){
        stock.add(item);
    }

    public void sellStock(ISell item){
        stock.remove(item);
    }

    public double calculateProfit(){
        double profit = 0;
        for (ISell item :this.stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
