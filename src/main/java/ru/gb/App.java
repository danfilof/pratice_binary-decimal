package ru.gb;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] binArr = new int[]{1, 0, 1, 0, 0, 0, 0, 0};
        int dec = 160;
        int[] decArr = new int[9];
        int[] decArr2 = new int[9];


        binToDec(binArr);
        decToBin(dec, decArr, decArr2);



    }

    public static void binToDec(int[] arr) {
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 1) {
                count = count + (int)Math.pow(2, arr.length - 1 - i);
            } else if (arr[i] == 0) {
                count = count + 0;
            } else {
                System.out.println("This is not a binary number");
            }

        }
        System.out.println("The decimal is " + count);
    }



    public static void decToBin(int dec, int[] decArr, int[] decArr2) {

        int decCount;
        int index = 0;
        int c = 0;
        int index1 = 0;


        while(dec >= 1) {

            if (dec % 2 == 0) {
                decCount = dec / 2;
                dec = decCount;
                decArr[index++] = c;
                System.out.println("0");
                decToBin(dec, decArr, decArr2);
            } else if (dec % 2 == 1) {
                decCount = (dec - 1) / 2;
                dec = decCount;
                System.out.println("1");
                decToBin(dec, decArr, decArr2);
            }


            if (index == 0) {
                index = 1;
            } else if (index == 1) {
                index = 0;
            }
            System.out.println( " index: " + index);

            break;
            }

        }

        }

