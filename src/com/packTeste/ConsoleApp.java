package com.packTeste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ConsoleApp{ 
	public static void main(String[] args)  {
		System.exit(100);
    StringBuffer sb = new StringBuffer("Hello World!\n\nJava version: ");
    sb.append(System.getProperty("java.version"));
    sb.append("\nJava home: ");
    sb.append(System.getProperty("java.home"));
    sb.append("\nCurrent dir: ");
    sb.append(System.getProperty("user.dir"));
    if (args.length > 0) {
      sb.append("\nArgs: ");
      for (int i = 0; i < args.length; i++) {
        sb.append(args[i]);
        sb.append(' ');
      }
    }
    sb.append("\n\nEnter a line of text, 'quit' or Ctrl-C to stop.\n\n>");
    System.out.print(sb.toString());
    try {
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      String line;
      while (((line = is.readLine()) != null) && (!line.equalsIgnoreCase("quit"))) {
        System.out.print("You wrote: " + line + "\n\n>");
      }
      is.close();
      System.exit(123);
    } catch (IOException e) {
      System.err.print(e);
    }
  }
}