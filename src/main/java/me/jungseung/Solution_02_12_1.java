package me.jungseung;

public class Solution_02_12_1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        if(n==1){
            answer[0][0] = 1;
            return answer;
        }
        int num = 1, x=0, y=0, i=1;

        while(num<n*n){
            for(y=y; y<n-i; y++){
                answer[x][y] = num;
                num++;
            }

            for(x=x; x<n-i; x++){
                answer[x][y] = num;
                num++;
            }

            for(y=y; y>i-1; y--){
                answer[x][y] = num;
                num++;
            }
            if(num==n*n) answer[x][y] = num;

            for(x=x; x>i; x--){
                answer[x][y] = num;
                num++;
            }
            i++;
        }

        return answer;
    }
}
