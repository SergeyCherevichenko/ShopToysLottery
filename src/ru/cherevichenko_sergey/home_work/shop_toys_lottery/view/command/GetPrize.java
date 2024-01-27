package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command.Command;

public class GetPrize extends Command {
    public GetPrize( ConsoleUI consoleUI) {
        super("Получить приз", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getPrize();

    }
}
