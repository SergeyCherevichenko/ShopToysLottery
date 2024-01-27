package ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.list_toys;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.toy.Toy;

import java.util.ArrayList;
import java.util.List;

public class ListToys {
    private List<Toy> toys;

    public ListToys() {
        this.toys = new ArrayList<>();
    }
    public void addToy(Toy toy){
           toys.add(toy);
        }


    public List<Toy> getToys() {
        return toys;
    }
}
