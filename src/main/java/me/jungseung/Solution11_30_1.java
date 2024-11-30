package me.jungseung;
import java.util.*;

public class Solution11_30_1 {
    public int[] solution(int[] answers) {
        // 1번 : 12345 , 2번 : 21232425 , 3번 : 3311224455
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int oneAnswer = 0;
        int twoAnswer = 0;
        int threeAnswer = 0;

        int oneIndex = 0;
        int twoIndex = 0;
        int threeIndex = 0;

        for(int ans : answers){
            if(oneIndex > 4) oneIndex = 0;
            if(twoIndex > 7) twoIndex = 0;
            if(threeIndex > 9) threeIndex = 0;

            if(ans == one[oneIndex]) oneAnswer++;
            if(ans == two[twoIndex]) twoAnswer++;
            if(ans == three[threeIndex]) threeAnswer++;

            oneIndex++;
            twoIndex++;
            threeIndex++;
        }

        int maxScore = Math.max(oneAnswer, Math.max(twoAnswer, threeAnswer));

        List<Integer> list = new ArrayList<>();

        if(maxScore == oneAnswer) list.add(1);
        if(maxScore == twoAnswer) list.add(2);
        if(maxScore == threeAnswer) list.add(3);

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}
