package com.ziaber.headfirst.designpatterns.decorator.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] bytes, int offset, int length) throws IOException {
        int result = super.read(bytes, offset, length);
        for (int i = offset; i < offset + result; i++){
            bytes[i] = (byte) Character.toLowerCase(bytes[i]);
        }

        return result;
    }
}
