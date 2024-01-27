package ru.cherevichenko_sergey.home_work.shop_toys_lottery.model.file_handler;

import java.io.IOException;

public interface Wreiter {
    public void save(String str) throws IOException;
    public void read() throws  Exception;
    public void delete() throws Exception;

}
