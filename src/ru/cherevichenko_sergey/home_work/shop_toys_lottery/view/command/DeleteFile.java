package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;

public class DeleteFile extends Command{
    public DeleteFile( ConsoleUI consoleUI) {
        super("Удалить список призов", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().deleteFile();

    }
}
