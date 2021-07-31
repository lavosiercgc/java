package com.ConcatenadoArrays;

import java.util.Arrays;

public class SimpleTesting {  
    public static void main(String[] args)  {
    	concatena();
    	
    }
    public static String concatena(){
        int[] Array1 = {00,10,20,30,40,50};
        int[] Array2 = {60,70,80,90,100};
        int len = Array1.length + Array2.length;
        int[] Concate = new int[len];
        int position = 0;
        for (int object : Array1)
        {
            Concate[position] = object;
            position++;
        }
        for (int object : Array2)
        {
            Concate[position] = object;
            position++;
        }
        System.out.println("Array1: " + Arrays.toString(Array1));
        System.out.println("Array2: " + Arrays.toString(Array2));
        System.out.println("Concatenated Array: " + Arrays.toString(Concate)); 
        
        return Arrays.toString(Concate);
    }  
} 
