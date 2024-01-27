package ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.command;

import ru.cherevichenko_sergey.home_work.shop_toys_lottery.view.ConsoleUI;

public class LotterySeveralTimes extends Command{
    public LotterySeveralTimes( ConsoleUI consoleUI) {
        super("Провести розыгрыш несколько раз и сразу получить призы", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().lotterySeveralTimesWithPrizes();

    }
}
