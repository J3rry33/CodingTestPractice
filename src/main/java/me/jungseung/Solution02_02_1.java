package me.jungseung;

public class Solution02_02_1 {
    public String solution(String polynomial) {
        String answer = "";
        String[] sp = polynomial.split(" +");

        int xNum = 0;
        int num = 0;

        for(int i=0; i<sp.length; i+=2){
            if(sp[i].startsWith("x")) xNum++;
            else if(sp[i].endsWith("x")){
                xNum += Integer.parseInt(sp[i].replace("x", ""));
            }
            else num += Integer.parseInt(sp[i]);
        }
        if(xNum == 1){
            answer = "x";
            if(num > 0)
                answer = answer + " + " + String.format("%d", num);
        }
        else if(xNum == 0){
            if(num > 0)
                answer = answer + String.format("%d", num);
        }
        else {
            answer = String.format("%d", xNum) + "x";
            if(num > 0)
                answer = answer + " + " + String.format("%d", num);
        }
        return answer;
    }
}
