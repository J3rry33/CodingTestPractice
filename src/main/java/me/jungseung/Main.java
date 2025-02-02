package me.jungseung;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(600, 100);
        map.put(400, 100);
        map.put(300, 200);
        map.put(200, 300);
        map.put(700, 200);
        map.put(800, 300);
        map.put(100, 400);
        map.put(900, 400);

        List<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1) == map.get(o2)){
                    return o2.compareTo(o1);
                }
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        System.out.println(keySet);
    }
}