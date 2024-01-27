package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command.Command;

public class Lottery extends Command {
    public Lottery( ConsoleUI consoleUI) {
        super("Провести розыгрыш игрушек", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getLottery();

    }
}
