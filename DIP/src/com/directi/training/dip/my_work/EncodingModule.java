package com.directi.training.dip.my_work;

import java.io.*;
import java.util.Base64;

public class EncodingModule
{
    public void encode(Reader reader, Writer writer) throws IOException {
        String inputString = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        writer.write(encodedString);
    }
}

