package com.example.spacestodashes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int bajt;
        try (
                FileInputStream fis = new FileInputStream("test123.txt");
                FileOutputStream fos = new FileOutputStream("test123_.txt")
            )   {
            do {
                bajt = fis.read();
                if (bajt != -1) fos.write(bajt != ' ' ? bajt : '_');
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}
