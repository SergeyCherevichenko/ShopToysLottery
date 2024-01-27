package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.presenter.Presenter;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command.MainMenu;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scan;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scan = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);


    }

    @Override
    public void start() {
        System.out.println("Это программа для розыгрыша призов в магазине игрушек\n " +
                "Выберите одну из операций ниже по номеру");
        while (work) {
            printMenu();
            choice();

        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    private void choice(){
        int line = scan.nextInt();
        if(line > 0 && line <= menu.size()) menu.execute(line);
        else error();
    }
    private void error(){
        System.out.println("Операции с таким номером не сцществует! Выберите из списка!");
    }
    private void printMenu(){
        System.out.println(menu.menu());
    }
     public void finish(){
        System.out.println("До новых встреч!");
        work = false;
    }


    public void addToy() {
        System.out.println("Введите id: ");
        String id = scan.next();
        System.out.println("Введите назавание игрушки: ");
        String name = scan.next();
        System.out.println("Введите количество этой игрушки: ");
        String quantity = scan.next();
        System.out.println("Введите вес(чатоту выпадения): ");
        String weight  = scan.next();
        presenter.addToy(id,name,quantity,weight);
    }
    public void getLottery(){
        presenter.getLottery();

    }
    public  void getPrize(){
        presenter.getPrize();
    }
    public void allPrizes(){
        presenter.allPrize();
    }
    public  void deleteFile(){
        presenter.deleteFile();
    }
    public void lotterySeveralTimesWithPrizes(){
        System.out.println("Введи сколько раз подряд вы хотите провести лотерею: ");
        String n = scan.next();
        presenter.lotterySeveralTimesWithPrizes(n);
    }


}