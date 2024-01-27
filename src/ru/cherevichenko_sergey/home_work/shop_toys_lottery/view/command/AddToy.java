package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;

public class AddToy extends Command {
    public AddToy( ConsoleUI consoleUI) {
        super("Добавить игрушку",consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addToy();

    }
}
