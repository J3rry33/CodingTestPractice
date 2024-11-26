package me.jungseung;
import java.util.*;

public class Solution11_26_2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;

        for(int n=0; n<commands.length; n++){
            i = commands[n][0]-1;
            j = commands[n][1]-1;
            k = commands[n][2]-1;

            int[] subArray = new int[j-i+1];
            for(int l=0; l<subArray.length; l++)
                subArray[l] = array[i+l];


            Arrays.sort(subArray);

            answer[n] = subArray[k];
        }
        return answer;
    }
}
