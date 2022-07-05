package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
static Random ran = new Random();
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(ran.nextInt(50));
        }
      
        for (Integer i:array) {
            System.out.print(i+",");
        }

        System.out.println();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(array.get(i) % 2 == 0) {
                array2.add(array.get(i));
            }else {
                array3.add(array.get(i));
            }
        }

        for (Integer i:array2) {
            System.out.print(i+",");
        }

        System.out.println();
        for (Integer i:array3) {
            System.out.print(i+",");
        }

    }
}
