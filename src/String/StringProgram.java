package String;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class StringProgram {
    public static void main(String[] args) {
        String s = "VIB";
        char c = s.charAt(s.length()-1);
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

        hm.put('I' , 1);
        hm.put('V' , 2);
        hm.put('X' , 10);
        hm.put('L' , 50);
        hm.put('C' , 100);
        hm.put('D' , 500);
        hm.put('M' , 1000);

        char ch = s.charAt(s.length()-1);

    }
}
