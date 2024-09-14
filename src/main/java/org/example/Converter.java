package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Converter {
    public static int romanToInt(String s) {
        if (ValidateRoman(s) == false) {
            throw new IllegalArgumentException("Invalid roman");
        }
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (i < s.length() - 1 && currValue < romanValues.get(s.charAt(i + 1))) {
                result -= currValue;
            } else {
                result += currValue;
            }
        }

        return result;
    }

    public static boolean ValidateRoman(String s) {
        String regex = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        if(s==null){
            return false;
        }
        boolean matches = Pattern.matches(regex, s);
        if (matches==true && s!="") {
            return true;
        } else {
            return false;
        }
    }
}