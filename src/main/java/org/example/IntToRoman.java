package org.example;

import java.util.Collections;
import java.util.TreeMap;

public class IntToRoman {
    TreeMap<Integer, String> lettersMap = new TreeMap<>(Collections.reverseOrder());

    public IntToRoman() {
        lettersMap.put(1000, "M");
        lettersMap.put(900, "CM");
        lettersMap.put(500, "D");
        lettersMap.put(400, "CD");
        lettersMap.put(100, "C");
        lettersMap.put(90, "XC");
        lettersMap.put(50, "L");
        lettersMap.put(10, "X");
        lettersMap.put(40, "XL");
        lettersMap.put(9, "IX");
        lettersMap.put(5, "V");
        lettersMap.put(4, "IV");
        lettersMap.put(1, "I");
    }

    public String IntToRoman(int num) {
        if (num <=0 || num >3999) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int value: lettersMap.keySet()){
            if (num==0){break;}
            while (num>=value){
                stringBuilder.append(lettersMap.get(value));
                num-=value;
            }
        }
        return stringBuilder.toString();
    }
}
