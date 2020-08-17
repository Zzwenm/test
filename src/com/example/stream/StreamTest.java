package com.example.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out =null;
        Exception exception;
        try {
            in = new FileInputStream("F:/a.txt");
            out = new FileOutputStream("F:/b.txt",true);
            int len = 0;
            byte[] bys = new byte[1024];
            while((len=in.read(bys))!=-1){
                out.write(bys);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
