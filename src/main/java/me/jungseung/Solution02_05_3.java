package me.jungseung;

public class Solution02_05_3 {
    public int solution(int[][] board) {
        int answer = 0;
        int boardLength = board.length;
        int[][] newBoard = new int[boardLength][boardLength];

        for(int i=0; i<boardLength; i++)
            for(int k=0; k<boardLength; k++)
                newBoard[i][k] = 0;

        for(int i=0; i<boardLength; i++)
            for(int k=0; k<boardLength; k++){
                if(board[i][k] == 1){
                    newBoard[i][k] = 1;
                    if(i-1 >= 0 && k-1 >= 0){
                        newBoard[i-1][k-1] = 1;
                    }
                    if(i-1 >= 0){
                        newBoard[i-1][k] = 1;
                    }
                    if(i-1 >= 0 && k+1 < boardLength){
                        newBoard[i-1][k+1] = 1;
                    }
                    if(k-1 >= 0){
                        newBoard[i][k-1] = 1;
                    }
                    if(k+1 < boardLength){
                        newBoard[i][k+1] = 1;
                    }
                    if(i+1 < boardLength && k-1 >= 0){
                        newBoard[i+1][k-1] = 1;
                    }
                    if(i+1 < boardLength){
                        newBoard[i+1][k] = 1;
                    }
                    if(i+1 < boardLength && k+1 < boardLength){
                        newBoard[i+1][k+1] = 1;
                    }
                }
            }

        for(int i=0; i<boardLength; i++)
            for(int k=0; k<boardLength; k++)
                if(newBoard[i][k] == 0) answer++;

        return answer;
    }
}
