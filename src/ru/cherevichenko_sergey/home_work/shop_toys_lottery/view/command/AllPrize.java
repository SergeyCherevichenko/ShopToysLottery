package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;

public class AllPrize extends Command{
    public AllPrize( ConsoleUI consoleUI) {
        super("Посмотреть список полученных призов", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().allPrizes();

    }
}
