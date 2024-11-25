package me.jungseung;

// https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Solution11_25_3 {
    public StringBuilder solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i=1; i<food.length; i++){
            int num = food[i]/2;
            while(num>0){
                answer.append(Integer.toString(i));
                num--;
            }
        }
        answer.append("0");
        for(int i=food.length-1; i>0; i--){
            int num = food[i]/2;
            while(num>0){
                answer.append(Integer.toString(i));
                num--;
            }
        }

        return answer;
    }
}
