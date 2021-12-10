package com.directi.training.dip.my_work;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();
        Reader reader = new FileRead("DIP/src/com/directi/training/dip/my_work/beforeEncryption.txt");
        Writer writer = new FileWrite("DIP/src/com/directi/training/dip/my_work/afterEncryption.txt");
        encodingModule.encode(reader, writer);
        reader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new DbWriter();
        encodingModule.encode(reader, writer);
    }
}
