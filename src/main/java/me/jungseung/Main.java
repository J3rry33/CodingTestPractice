package me.jungseung;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4};
        int answer = 0;
        int[] freq = new int[1000];
        int freqNum = -1;

        Arrays.fill(freq, 0);

        for(int i=0; i<array.length; i++){
            freq[array[i]]++;
        }
        System.out.println(freq[0]);

        for(int i=0; i<freq.length; i++){
            if(freq[i] > freqNum) freqNum = freq[i];
            if(freq[i] == freqNum) System.out.println("same");
        }
        answer = freqNum;
        System.out.println(answer);
    }
}