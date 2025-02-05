package me.jungseung;

public class Solution02_05_2 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        boolean statement = true;
        int sum = 0;
        int k=0;

        while(statement){
            for(int i=0; i<num; i++){
                answer[i] = i+k;
                sum += answer[i];
            }
            if(sum == total)
                statement = false;
            else if(sum > total)
                k--;
            else
                k++;
            sum = 0;
        }
        return answer;
    }
}
