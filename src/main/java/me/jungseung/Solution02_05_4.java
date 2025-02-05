package me.jungseung;

public class Solution02_05_4 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        int largeNum = 0;
        int smallNum = 0;
        int remainder = 1;

        if(numer > denom) {
            largeNum = numer;
            smallNum = denom;
        }
        else{
            largeNum = denom;
            smallNum = numer;
        }

        while(remainder != 0){
            remainder = largeNum % smallNum;
            largeNum = smallNum;
            smallNum = remainder;
        }

        answer[0] = numer/largeNum;
        answer[1] = denom/largeNum;

        return answer;
    }
}
