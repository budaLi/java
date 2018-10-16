package myfirst;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int tem=0;
        Map<Integer, Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target-nums[i])) {
				if (i<tem) {
					ans[0]=i;
					ans[1]=tem;
				}else if (i>tem) {
					ans[0]=tem;
					ans[1]=i;
				}
				break;
			}
			map.put(nums[i], i);
		}
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
		Solution anSolution=new Solution();
		int nums[]= {1,2,3,4,5};
		int target=6;
		int[] res = anSolution.twoSum(nums, target);
		System.out.println(res);
	}
}

