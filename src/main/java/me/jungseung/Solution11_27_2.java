package me.jungseung;

public class Solution11_27_2 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index = 0;
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(cards1[card1Index])){
                card1Index++;
                if(card1Index == cards1.length) card1Index--;
            }
            else if(goal[i].equals(cards2[card2Index])){
                card2Index++;
                if(card2Index == cards2.length) card2Index--;
            }
            else return "No";
        }
        return "Yes";
    }
}
