package com.directi.training.dip.my_work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

public class FileRead implements Reader{

    private String _fileName;

    public FileRead(String fileName){
        _fileName = fileName;
    }

    @Override
    public String read() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(_fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();
    }
}
