package com.directi.training.dip.my_work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite implements Writer{

    private String _fileName;

    public FileWrite(String fileName){
        _fileName=fileName;
    }

    @Override
    public void write(String msg) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName));
        writer.append(msg);
        writer.close();
    }
}
