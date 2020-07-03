package E200703;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
	public int solution(int[] nums) {
        int pokemon = nums.length/2;
        Set<Integer> type = new HashSet<>(); //Remove duplicate
        for(int i=0;i<nums.length;i++){
            type.add(nums[i]);
        }
        return type.size() > pokemon ? pokemon : type.size();
    }
}
