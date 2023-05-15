package Anand;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class RomanToInt {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        Map<Character, Integer> hm = new Map<>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(Character key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Character, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Character> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<Character, Integer>> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
        hm.put('I', 1);
        hm.put('V', 2);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);


        int sum = s.charAt(s.length() - 1);
        for (int i = 0; i < s.length() - 2; i++) {
            sum = sum + hm.get(s.charAt(i));
        }
//        System.out.println(sum);
        return sum;
    }
}
