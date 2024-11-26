package me.jungseung;
import java.util.*;

public class Solution11_26_1 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i].charAt(n) + "," + strings[i];
        }

        Arrays.sort(answer);

        for(int i=0; i<strings.length; i++){
            answer[i] = answer[i].substring(2);
        }

        return answer;
    }
}
