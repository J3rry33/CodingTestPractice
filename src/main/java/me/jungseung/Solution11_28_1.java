package me.jungseung;
import java.util.*;

public class Solution11_28_1 {
    public String solution(int a, int b) {
        // 31 29 31 30 31 30 31 30 31 30 31 30

        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,0);
        map.put(2,31);
        map.put(3,60);

        for(int i=4; i<13; i++){
            if(i>8){
                if(i%2==0) map.put(i,map.get(i-1)+30);
                else map.put(i,map.get(i-1)+31);
            }
            else{
                if(i%2==0) map.put(i,map.get(i-1)+31);
                else map.put(i,map.get(i-1)+30);
            }

        }

        int day = 0;
        day = map.get(a) + b;

        switch(day%7){
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
        }
        return "error";
    }
}
