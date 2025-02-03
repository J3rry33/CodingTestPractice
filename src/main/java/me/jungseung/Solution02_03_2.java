package me.jungseung;

public class Solution02_03_2 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] strSplit = new String[5];
        int x = 0;
        int y = 0;
        String z = "";

        for(int i=0; i<quiz.length; i++){
            String str = quiz[i];
            strSplit = str.split(" ");

            if(strSplit[1].equals("+")){ // +
                x = Integer.parseInt(strSplit[0]);
                y = Integer.parseInt(strSplit[2]);
                z = Integer.toString(x+y);

                if(z.equals(strSplit[4]))
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
            else{ // -
                x = Integer.parseInt(strSplit[0]);
                y = Integer.parseInt(strSplit[2]);
                z = Integer.toString(x-y);

                if(z.equals(strSplit[4]))
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
        }
        return answer;
    }
}
