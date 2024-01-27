package ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.shop_toys;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.file_handler.Wreiter;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.file_handler.FileHandler;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.list_toys.ListToys;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.toy.Toy;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class ShopToys {
   private ToyBuilder toyBuilder;
   private ListToys listToys;
   private PriorityQueue<Toy> prizeToys;
   private Random lottery;
   Wreiter wreiter;



    public ShopToys(FileHandler fl) {
        this.toyBuilder = new ToyBuilder();
        this.listToys = new ListToys();
        this.prizeToys = new PriorityQueue<>();
        this.lottery = new Random();
        this.wreiter = fl;
    }
    public void  addToy(String id,String name,String quantity,String weight){
        try {
            int a = Integer.parseInt(quantity);
            int b = Integer.parseInt(weight);

        }catch (NumberFormatException e){
            System.out.println("В поле quantity или в поле weight вы ввели не число!");
        }
        Toy toy = toyBuilder.toyBuild(id,name,quantity,weight);
        listToys.addToy(toy);
    }
    public void lotteryPrizeNumber(){
        if (listToys.getToys().size() == 0) {
            throw new NullPointerException(" Для розыгрыша необходимо добавить хотябы одну игрушку!");
        }else {
        int count = 0;
        for (int i = 0; i < listToys.getToys().size(); i++) {
            count += Integer.parseInt(listToys.getToys().get(i).getWeight());
        }

            int prizeNumber = lottery.nextInt(count * 10 + 1);
            int j = 0;
            for (int i = 0; i < listToys.getToys().size(); i++) {
                if (prizeNumber <= (Integer.parseInt(listToys.getToys().get(i).getWeight()) * 10 + j)
                        && Integer.parseInt(listToys.getToys().get(i).getQuantity()) != 0) {
                    prizeToys.add(listToys.getToys().get(i));
                    listToys.getToys().get(i).
                            setQuantity(String.valueOf(Integer.parseInt(listToys.getToys().get(i).getQuantity()) - 1));
                    break;

                } else if (prizeNumber <= (Integer.parseInt(listToys.getToys().get(i).getWeight()) * 10 + j)
                        && Integer.parseInt(listToys.getToys().get(i).getQuantity()) == 0) {
                    listToys.getToys().remove(listToys.getToys().get(i));
                    break;
                }
                j += Integer.parseInt(listToys.getToys().get(i).getWeight()) * 10;
            }
        }

            System.out.println("Розыгрышь состоялся!");

    }

    public  void  getPrize() throws IOException {
        try {
        String prize = prizeToys.peek().getId() + " " + prizeToys.peek().getName();
            wreiter.save(prize);
            System.out.println("Приз получен!");
        }catch (IOException e){
            throw new IOException("Список игрушек для розыгрыша пуст!");

        }catch (NullPointerException e){
            throw new NullPointerException("Для розыгрыша необходимо добавить хотябы одну игрушку или провести розыгрышь!");
        }
        prizeToys.poll();
    }
    public void allPrizes() throws Exception{
        System.out.println("Полученные призы: ");
        wreiter.read();
    }
    public void deleteFile() {
        try {
            wreiter.delete();
        } catch (Exception e) {
            System.out.println("!!!");
        }
    }


}
