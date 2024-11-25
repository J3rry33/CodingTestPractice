package me.jungseung;
import java.util.*;

public class Solution {
        public int solution(String s) {
            Map<Integer, String> map = new HashMap<>();
            int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
            map.put(0, "zero");
            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
            map.put(5, "five");
            map.put(6, "six");
            map.put(7, "seven");
            map.put(8, "eight");
            map.put(9, "nine");

            for(int i=0; i<10; i++)
                arr[i] = 1;

            for(int i=0; i<10; i++)
                if(arr[i] == 1)
                    s = s.replaceAll(map.get(i), Integer.toString(i));

            int answer = Integer.parseInt(s);

            return answer;
        }
}
