package me.jungseung;
import java.util.*;

public class Solution02_02_2 {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> list = new ArrayDeque<>();

        for(int i=0; i<arr.length; i++)
            list.addLast(arr[i]);

        int tempListSize = list.size();

        for(int k=0; k<query.length; k++){
            tempListSize = list.size();

            if(k%2==0) { // even
                for(int j=query[k]; j<tempListSize-1; j++)
                    list.removeLast();
            }
            else{ // odd
                for(int p=0; p<query[k]; p++)
                    list.removeFirst();
            }
        }

        int[] answer = new int[list.size()];
        int listSize = list.size();

        for(int t=0; t<listSize; t++){
            answer[t] = list.peekFirst();
            list.pollFirst();
        }

        return answer;
    }
}
