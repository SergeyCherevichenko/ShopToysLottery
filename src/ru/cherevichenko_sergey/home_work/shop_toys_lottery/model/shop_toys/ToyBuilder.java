package ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.shop_toys;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.toy.Toy;

public class ToyBuilder {
    public Toy toyBuild(String id, String name, String quantity, String weight) {
        Toy toy = new Toy(id,name,quantity,weight);
        return toy;
    }
}
