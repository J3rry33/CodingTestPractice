package me.jungseung;
import java.util.*;
import java.lang.Math;

public class Solution_02_06_1 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] diceArr = new int[7];
        int statement = 0;

        Arrays.fill(diceArr, 0);
        diceArr[a]++;
        diceArr[b]++;
        diceArr[c]++;
        diceArr[d]++;

        for(int p=1; p<diceArr.length; p++){
            if(diceArr[p] == 4)
                return 1111*p; // 4
            else if(diceArr[p] == 3){ // 3 1
                for(int q=1; q<diceArr.length; q++)
                    if(diceArr[q] == 1)
                        return (int) Math.pow(10*p+q, 2);
            }
            else if(diceArr[p] == 2){ // 2 2, 2 1 1
                for(int q=1; q<diceArr.length; q++){
                    if(diceArr[q] == 2 && p != q)
                        return (p+q) * (q-p);
                    else if(diceArr[q] == 1){
                        for(int r=q; r<diceArr.length; r++){
                            if(diceArr[r] == 1 && q != r)
                                return q*r;
                        }
                    }
                }
            }
        }

        for(int p=1; p<diceArr.length; p++)
            if(diceArr[p] == 1) return p;

        return -1;
    }
}
