package me.jungseung;
import java.util.*;

public class Solution11_27_3 {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
            map.put(num, 1);

        if(map.size() < nums.length/2) answer = map.size();
        else answer = nums.length/2;
        return answer;
    }
}
