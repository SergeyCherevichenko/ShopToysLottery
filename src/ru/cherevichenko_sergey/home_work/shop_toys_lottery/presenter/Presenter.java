package ru.cherevichenko_sergey.home_work.shop_toys_lottery.presenter;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.file_handler.FileHandler;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.shop_toys.ShopToys;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.View;

import javax.imageio.IIOException;
import java.io.IOException;

public class Presenter {
    View view;
    ShopToys shop;

    public Presenter(View view) {
        this.view = view;
        this.shop = new ShopToys(new FileHandler());
    }
    public void addToy(String id,String name,String quantity,String weight){
        shop.addToy(id,name,quantity,weight);
    }
    public void getLottery() {
        try {
            shop.lotteryPrizeNumber();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public void getPrize() {
        try {
            shop.getPrize();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public void allPrize() {
        try {
            shop.allPrizes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void deleteFile(){
        shop.deleteFile();

    }
    public void lotterySeveralTimesWithPrizes(String n){
        int a = 0;
        try {
             a  = Integer.parseInt(n);
        }catch( NumberFormatException e){
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < a; i++) {
            getLottery();
        }
        for (int i = 0; i < a; i++) {
            getPrize();
        }
    }
    }
