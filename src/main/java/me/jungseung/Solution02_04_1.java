package me.jungseung;
import java.util.*;

public class Solution02_04_1 {
    public int solution(int[] array) {
        if(array.length == 1) return array[0];

        int answer = 0;
        int[] freq = new int[1000];
        int freqNum = -1;
        int statement = 0;

        Arrays.fill(freq, 0);

        for(int i=0; i<array.length; i++){
            freq[array[i]]++;
        }

        int freqMaxNum = Arrays.stream(freq).max().getAsInt();

        //System.out.println(Arrays.stream(freq).max().getAsInt());

        for(int i=0; i<freq.length; i++){
            if(freq[i] > freqNum){
                freqNum = freq[i];
                answer = i;
            }
            if(freqMaxNum == freq[i])
                statement++;
        }
        System.out.println(statement);
        if(statement>1) return -1;

        return answer;
    }
}
