package ru.gb;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] binArr = new int[]{1, 1, 0, 1, 1, 1, 0, 1};
        int dec = 221;

        String sBinResult;

        binToDec(binArr);
        sBinResult = decToBin(dec);

        System.out.println(sBinResult);
    }

    public static void binToDec(int[] arr) {
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 1) {
                count = count + (int) Math.pow(2, arr.length - 1 - i);
            } else if (arr[i] == 0) {
                count = count + 0;
            } else {
                System.out.println("This is not a binary number");
            }

        }
        System.out.println("The decimal is " + count);
    }

    public static String decToBin(int dec) {

        int iCount;

        String sCalc = "";  // String to collect the result of conversion

        iCount = dec;

        while (iCount >= 1) {
            // Check if there is a reminder after dividing iCount by Counting Base (2)
             if (iCount % 2 == 0) {
                 sCalc += "0";

                 // Reduce iCount dividing it by Counting Base (2)
                 iCount = iCount / 2;

//                 System.out.print("0");
             } else {
                 sCalc += "1";

                 // Reduce iCount dividing it by Counting Base (2)
                 iCount = (iCount - 1) / 2;

//                 System.out.print("1");
             }
            }

        StringBuilder sb = new StringBuilder(sCalc);
        sb.reverse();
        return sb.toString();
        }


    }





