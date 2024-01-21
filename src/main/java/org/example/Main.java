package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(HWStreamAPI.sumEvenNums());
        HWStreamAPI.multByTwo();
        System.out.println(HWStreamAPI.findMax());
        HWStreamAPI.findOddNums();
        System.out.println(HWStreamAPI.findAvg());
        System.out.println(HWStreamAPI.findByStream(new Integer[]{-5, -2, 1, 3, 4, 4, 3, -2, 3}));

        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.IntToRoman(19));
    }
}