package me.jungseung;

public class Solution_02_11_1 {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0], x2 = dots[1][0],x3 = dots[2][0],x4 = dots[3][0],
                y1 = dots[0][1],y2 = dots[1][1],y3 = dots[2][1],y4 = dots[3][1];
        if((double)(y1-y2)/(x1-x2) == (double)(y3-y4)/(x3-x4))
            answer = 1;
        else if((double)(y1-y3)/(x1-x3) == (double)(y2-y4)/(x2-x4))
            answer = 1;
        else if((double)(y1-y4)/(x1-x4) == (double)(y2-y3)/(x2-x3))
            answer = 1;

        return answer;
    }
}
