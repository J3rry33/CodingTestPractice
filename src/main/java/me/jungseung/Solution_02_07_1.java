package me.jungseung;
import java.util.*;

public class Solution_02_07_1 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] lineArr = new int[201];
        Arrays.fill(lineArr, 0);

        for(int i=0; i<lines.length; i++){
            for(int k=lines[i][0]; k<lines[i][1]; k++){
                lineArr[k+100]++;
            }
        }
        for(int i=0; i<lineArr.length-1; i++)
            if(lineArr[i] > 1) answer++;
        return answer;
    }
}
