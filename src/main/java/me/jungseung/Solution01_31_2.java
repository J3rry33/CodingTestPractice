package me.jungseung;

public class Solution01_31_2 {
    StringBuilder answerBuilder = new StringBuilder();

    public String solution(String code) {
        int mode = 0;
        Character one = '1';

        for(int i=0; i<code.length(); i++){
            if(one.equals(code.charAt(i))){
                if(mode == 0) mode = 1;
                else mode = 0;
            }
            else {
                if(mode == 0) Mode0(code, i);
                else if(mode == 1) Mode1(code, i);
            }
        }

        String answer = answerBuilder.toString();
        if(answer.length()==0) return "EMPTY";
        return answer;
    }

    public void Mode0(String code, int idx) {
        if(idx % 2 == 0) answerBuilder.append(code.charAt(idx));
    }

    public void Mode1(String code, int idx) {
        if(idx % 2 == 1) answerBuilder.append(code.charAt(idx));
    }
}
