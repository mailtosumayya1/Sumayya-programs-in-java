
import java.util.HashMap;
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            if (i < s.length() - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        System.out.println(converter.romanToInt("III"));       // Output: 3
        System.out.println(converter.romanToInt("IV"));        // Output: 4
        System.out.println(converter.romanToInt("IX"));        // Output: 9
        System.out.println(converter.romanToInt("LVIII"));     // Output: 58
        System.out.println(converter.romanToInt("MCMXCIV"));   // Output: 1994
    }
}
