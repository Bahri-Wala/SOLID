package com.directi.training.dip.my_work;

import java.io.IOException;

public class DbWriter implements Writer{
    @Override
    public void write(String msg) throws IOException {
        MyDatabase db = new MyDatabase();
        db.write(msg);

    }
}
