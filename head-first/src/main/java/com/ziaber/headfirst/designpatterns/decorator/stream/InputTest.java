package com.ziaber.headfirst.designpatterns.decorator.stream;

import java.io.*;

public class InputTest {

    private static final String MESSAGE = "I know the Decorator Pattern therefore I RULE!";

    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream(MESSAGE.getBytes())));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
