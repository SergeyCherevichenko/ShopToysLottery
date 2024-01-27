package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;
import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command.Command;

public class Finish extends Command {
    public Finish( ConsoleUI consoleUI) {
        super("Закончить работу приложения", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();

    }

}
