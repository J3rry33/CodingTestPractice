package me.jungseung;

public class Solution11_28_2 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numArray = new int[number+1];
        int count;

        for(int i=1; i<number+1; i++){
            count = 0;
            for(int k=1; k<=Math.sqrt(i); k++){
                if(i%k==0) count++;
            }
            count *= 2;
            if(i % Math.sqrt(i) == 0) count--;
            numArray[i] = count;
        }

        for(int num : numArray){
            if(num>limit) answer += power;
            else answer += num;
        }
        return answer;
    }
}
