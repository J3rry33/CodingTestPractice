package me.jungseung;

public class Solution02_05_1 {
    public int solution(int[] common) {
        int answer = 0;
        int r = 0;
        int lastIndex = common.length - 1;

        if(common[1] - common[0] == common[2] - common[1]){
            r = common[1] - common[0];
            answer = common[lastIndex] + r;
        }
        else{
            r = common[1] / common[0];
            answer = common[lastIndex] * r;
        }

        return answer;
    }
}
