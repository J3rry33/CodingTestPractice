package me.jungseung;

public class Solution11_26_3 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder binaryArr = new StringBuilder();

        for(int i=0; i<n; i++){
            while(arr1[i]>0 || arr2[i]>0){
                binaryArr.append(Integer.toString(arr1[i]%2 + arr2[i]%2));
                arr1[i] /= 2;
                arr2[i] /= 2;
            }
            int temp = n-binaryArr.length();
            if(binaryArr.length() < n)
                for(int k=0; k<temp; k++)
                    binaryArr.append("0");
            answer[i] = binaryArr.reverse().toString();
            binaryArr.setLength(0);
        }

        for(int i=0; i<n; i++){
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("2", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        return answer;
    }
}
