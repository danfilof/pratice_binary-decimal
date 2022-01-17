package ru.gb;

import java.util.Set;

public class App {

    public static void main(String[] args) {

        int[] binArr = new int[]{1, 1, 0, 1, 0, 1};
        int dec = 59;
        int hexValue = dec;
        String hexToDecValue = "6A";

        Set <String> alphabet = Set.of("A", "B", "C", "D", "E", "F");

        String sDecToBinResult;
        int iBinaryToDecimalResult;
        String sDecToHex;
        String sHexToDecResult;
        String sHexToBinResult;
        String sBintoHexResult;



        sDecToBinResult = decToBin(dec);
        iBinaryToDecimalResult = binToDec(binArr);
        sDecToHex = DecToHex(hexValue);
        sHexToDecResult = HexToDec(hexToDecValue, alphabet);
        sHexToBinResult = HexToBin(hexToDecValue, alphabet);
        sBintoHexResult = BinToHex(binArr);

        System.out.println("Binary to decimal: " + iBinaryToDecimalResult);
        System.out.println("Decimal to binary: " + sDecToBinResult);
        System.out.println("Decimal to hex: : " + sDecToHex);
        System.out.println("Hex to decimal: " + sHexToDecResult);
        System.out.println("Hex to binary: " + sHexToBinResult);
        System.out.println("Binary to hex: " + sBintoHexResult);

    }

    public static int binToDec(int[] arr) {
        int count = 0;  // int to collect the result of conversion

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 1) {   // Check the value in an array
                count = count + (int) Math.pow(2, arr.length - 1 - i);
            } else if (arr[i] == 0) {
                count = count + 0;
            } else {
                System.out.println("This is not a binary number");
            }

        }
        //System.out.println("The decimal is " + count);
        return count;
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
             } else {
                 sCalc += "1";
                 // Reduce iCount dividing it by Counting Base (2)
                 iCount = (iCount - 1) / 2;
             }
            }
        StringBuilder sb = new StringBuilder(sCalc);
        sb.reverse();
        return sb.toString();
        }


        public static String DecToHex(int hexValue) {
            String hexCount = "";
            int hexValue1;
            int hexValue2;
            String hex = "";
            String hex2;
            // check if reminder is zero
            if (hexValue % 16 == 0) {
                hexValue2 = hexValue / 16;
                hex2 = String.valueOf(hexValue2) + "0";
                return hex2;
                //check if reminder is not zero
            } else if (!(hexValue % 16 == 0)) {
                hexValue2 = hexValue / 16;
                hexValue1 = hexValue % 16;
                // check if the initial value is less than ten
                if (hexValue1 < 10) {
                    hex2 = String.valueOf(hexValue2) + String.valueOf(hexValue1);
                    return hex2;
                }  // check if the initial value is between 9 adn 10 and give the following letter
                if (hexValue1 > 9  || hexValue1 <16) {
                    if (hexValue1 == 10) hex = "A";
                    if (hexValue1 == 11) hex = "B";
                    if (hexValue1 == 12) hex = "C";
                    if (hexValue1 == 13) hex = "D";
                    if (hexValue1 == 14) hex = "E";
                    if (hexValue1 == 15) hex = "F";
                    hex2 = String.valueOf(hexValue2) + hex;
                    return hex2;
                }
            } else {
                System.out.println("Nothing happens");
                return null;
            }
                return null;
            }


            public static String HexToDec(String hexToDecValue, Set<String> alphabet) {

        char ch1 = hexToDecValue.charAt(0);
        char ch2 = hexToDecValue.charAt(1);
        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);
        int dh1;
        int dh2;
        String sdh2 = "";
        dh1 = Integer.parseInt(s1) * 16;
        String resultHD;

        //check if second character is a letter and give the following value to it
        if (alphabet.contains(s2)) {
            if (s2.equals("A")) sdh2 = String.valueOf(10);
            if (s2.equals("B")) sdh2 = String.valueOf(11);
            if (s2.equals("C")) sdh2 = String.valueOf(12);
            if (s2.equals("D")) sdh2 = String.valueOf(13);
            if (s2.equals("E")) sdh2 = String.valueOf(14);
            if (s2.equals("F")) sdh2 = String.valueOf(15);
            dh2 = dh1 + Integer.parseInt(sdh2);
            resultHD = String.valueOf(dh2);
            return resultHD;
            // check if second character is a number
        } else if (!(alphabet.contains(s2))) {
            dh2 = dh1 + Integer.parseInt(s2);
            resultHD = String.valueOf(dh2);
            return resultHD;
        } else {
            System.out.println("Wrong value");
        }
        return null;
            }

            public static String HexToBin (String hexToDecValue, Set<String> alphabet) {
        int hb;
        String hbs;
        // usage of HexToDec, then decToBin to avoid calculations;
                hb = Integer.parseInt(HexToDec(hexToDecValue, alphabet));
                hbs =  "0" + decToBin(hb);
                return hbs;
            }
            public static String BinToHex(int[] binArr) {
        // usage of BinToDec, then DecToHex
                int bh;
                String bhs;

                bh = binToDec(binArr);
                bhs = DecToHex(bh);
                return bhs;
            }
        }






