package com.packTeste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ArrayLeituraDeArquivos {
  public static void main(String args[]) {

   //byte[] array = new byte[100];

    try {
        OutputStream out = new FileOutputStream("c:\\ArrayList.txt");
        out.write(30);
      InputStream input = new FileInputStream("c:\\ArrayList.txt");

      System.out.println("Available bytes in the file: " + input.available());
      int a = input.available();
      byte[] array = new byte[a];

      // Read byte from the input stream
      input.read(array);
			
      System.out.println("Data read from the file: ");

      // Convert byte array into string
      String data = new String(array);
      System.out.println("aqui "+data);
      System.out.println(data.length());

      // Close the input stream
      input.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}